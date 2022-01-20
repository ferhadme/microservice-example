package com.ferhad.authservice.service;

import com.ferhad.authservice.model.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User createNewUser(User user);

    String getEncodedPassword(String password);
}
