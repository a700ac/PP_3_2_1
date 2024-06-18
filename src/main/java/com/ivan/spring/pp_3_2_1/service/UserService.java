package com.ivan.spring.pp_3_2_1.service;

import com.ivan.spring.pp_3_2_1.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUser(int id);
    public void deleteUser(int id);
}
