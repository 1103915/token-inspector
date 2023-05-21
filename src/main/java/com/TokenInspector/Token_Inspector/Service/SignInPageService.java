package com.TokenInspector.Token_Inspector.Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.TokenInspector.Token_Inspector.Model.User;
@Service
public class SignInPageService{
   
    List<User> storage = new ArrayList<>();
    public List<User> GetDetails(){
        return this.storage;
    }
    public void AddDetails(User model){
        storage.add(model);
    }
}
