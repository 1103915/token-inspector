package com.coffeeshop.coffee_shop_employees.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.coffeeshop.coffee_shop_employees.Model.UserDetails;


@Repository
public interface UserService extends JpaRepository<UserDetails , Long>{
    

   /*
   List<UserDetails> storage = new ArrayList<>();
    public List<UserDetails> GetDetails(){
        return this.storage;
    }
    public void AddDetails(UserDetails model){
        storage.add(model);
    } */
   
    
}
