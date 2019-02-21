package com.example.demoMbaits.server;


import com.example.demoMbaits.domain.User;

public interface UserService {
    User selectById(Long id);
}
