package com.guesser.myfinances.service;

import com.guesser.myfinances.model.entity.User;

public interface UserService {

    User auth(String email, String password);
    User saveUser(User user);
    void verifyEmail(String email);

}
