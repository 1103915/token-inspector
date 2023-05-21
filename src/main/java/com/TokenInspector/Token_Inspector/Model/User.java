package com.TokenInspector.Token_Inspector.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Entity
@Table(name = "Users")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String dob;
    private String email;
    private String username;
    private String password;
    private String contactnumber;
    private String gender;

    public User(long id, String name, String dob, String email, String username, String password, String contactnumber,
            String gender) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.username = username;
        this.password = password;
        this.contactnumber = contactnumber;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
