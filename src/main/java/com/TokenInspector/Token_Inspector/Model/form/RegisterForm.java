package com.TokenInspector.Token_Inspector.Model.form;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.TokenInspector.Token_Inspector.Model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterForm {
    private String name;
    private String dob;
    private String email;
    private String username;
    private String password;
    private String contactNumber;
    private String gender;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(
                0, name, dob, email, username, passwordEncoder.encode(password), contactNumber, gender);
    }
}
