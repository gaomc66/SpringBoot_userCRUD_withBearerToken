package com.mengchen.assignment2.dao;

import com.mengchen.assignment2.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDAO {

    public List<User> listAllUser();

    public User findByEmail(String theEmail);

    public void createUser(User theUser);

    public void updateUser(User theUser);

    public void deleteUser(String theEmail);
}
