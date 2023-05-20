package com.TokenInspector.Token_Inspector.SecurityConfig;

import com.TokenInspector.Token_Inspector.Model.UserInfo;
import com.TokenInspector.Token_Inspector.Service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;

@Configuration
@EnableWebSecurity
public class SecConfiguration {
    @Bean
    public PasswordEncoder passwordEncoder(){return new BCryptPasswordEncoder();}
    @Bean
    public UserDetailsService userDetailsService(UserService userRepo) {
        return username -> {
            UserInfo myuser = userRepo.findByUsername(username);
            if (myuser != null) return myuser;
            throw new UsernameNotFoundException("User '" + username + "' not found");
        };
    }
    @Bean

   public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.authorizeHttpRequests(
                        requests -> requests.requestMatchers(toH2Console()).permitAll()
                                .requestMatchers(HttpMethod.GET,"/Registrationform", "/SignInPage", "../css/LoginPageStyle","/images/**","/js/**").permitAll()
                                .anyRequest()
                                .authenticated()
                                
        ).
                formLogin(form -> form.loginPage("/SignInPage").defaultSuccessUrl("/",true))
                .logout(LogoutConfigurer::permitAll)
                .headers(headers -> headers.frameOptions().disable())
                .csrf(csrf -> csrf.ignoringRequestMatchers(toH2Console()))
                .build();
    }
    }



