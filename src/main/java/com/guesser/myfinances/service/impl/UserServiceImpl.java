package com.guesser.myfinances.service.impl;

import com.guesser.myfinances.model.entity.User;
import com.guesser.myfinances.model.repository.UserRepository;
import com.guesser.myfinances.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User auth(String email, String password) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public void verifyEmail(String email) {
        userRepository.Optional
    }
}
