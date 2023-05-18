package com.TokenInspector.Token_Inspector.Model;


import org.springframework.stereotype.Component;



@Component

public class RegistrationDetails extends UserInfo{
   
private String username;
private String password;    

   /*  public RegistrationDetails(String username, String password, PasswordEncoder passwordEncoder) {
        super(username, passwordEncoder.encode(password));
        //TODO Auto-generated constructor stub
    }
    public UserInfo toUser(PasswordEncoder passwordEncoder) {
        return new UserInfo(
                passwordEncoder.encode(password),username);
    } */
    
   
    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
}
