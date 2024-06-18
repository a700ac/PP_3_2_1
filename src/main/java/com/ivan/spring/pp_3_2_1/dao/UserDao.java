package com.ivan.spring.pp_3_2_1.dao;

import com.ivan.spring.pp_3_2_1.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUser(int id);
    public void deleteUser(int id);
}
