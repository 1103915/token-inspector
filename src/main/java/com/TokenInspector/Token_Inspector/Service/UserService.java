package com.TokenInspector.Token_Inspector.Service;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TokenInspector.Token_Inspector.Model.UserInfo;



@Repository
public interface UserService extends JpaRepository<UserInfo , Long>{
   /*
   List<UserDetails> storage = new ArrayList<>();
    public List<UserDetails> GetDetails(){
        return this.storage;
    }
    public void AddDetails(UserDetails model){
        storage.add(model);
    } */
    UserInfo findByUsername(String myusername);
}
