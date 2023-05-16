package com.coffeeshop.coffee_shop_employees.Model;

import org.springframework.stereotype.Component;

@Component

public class HomePage {
    private String searchQuery;

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }
    
}
