package com.usica.usica.service;

import com.usica.usica.model.User;
import com.usica.usica.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private TagService tagService;

    public User createUser(User user) {
        String tag = tagService.createTag("user");
        user.setTagId(tag);
        long timeInEpoch = Instant.now().getEpochSecond();
        user.setCreatedAt(timeInEpoch);
        user.setUpdatedAt(timeInEpoch);
        user.setLoginAttempts(0);

        return userRepo.save(user);
    }
}
