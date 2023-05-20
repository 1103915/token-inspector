package com.TokenInspector.Token_Inspector.Model;

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
