package com.ivan.spring.pp_3_2_1.dao;

import com.ivan.spring.pp_3_2_1.model.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void saveUser(User user);
    User getUser(int id);
    void deleteUser(int id);
}
