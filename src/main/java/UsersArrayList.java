package Daos;
package com.codeup.adlister.dao;
import interfaces.Users;
import com .codeup.adlister.models.User;

import java.util.ArrayList;
import java.util.List;


public class UsersArrayList {
    public List<User> all() {
        User user = new User();
        user.setId(1);
        user.setUsername("person");
        user.setEmail("person@gmail.com");
        User Becca = new User();
        Becca.setId(2);
        Becca.setUsername("Becca");
        Becca.setEmail("Becca@gmail.com");

        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(Becca);

        return users;
    }

    public Long insert(User user) {
        return null;
    }

}
