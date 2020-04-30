package com.firstservice.user.service;

import com.firstservice.user.repository.User;
import com.firstservice.user.repository.UserReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserReposity userReposity;

    public User save(User user) {
        return userReposity.insert(user);
    }

    public List<User> get() {
        return userReposity.findAll();
    }

    public void update(User user) {
        userReposity.save(user);
    }

    public void delete(User user) {
        userReposity.delete(user);
    }

    public User validateClient(String username,String company) {

        return userReposity.findByUsernameAndCompany(username,company);
    }
}
