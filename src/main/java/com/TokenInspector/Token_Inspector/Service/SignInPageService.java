package com.TokenInspector.Token_Inspector.Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.TokenInspector.Token_Inspector.Model.UserInfo;
@Service
public class SignInPageService{
   
    List<UserInfo> storage = new ArrayList<>();
    public List<UserInfo> GetDetails(){
        return this.storage;
    }
    public void AddDetails(UserInfo model){
        storage.add(model);
    }
}
