package com.example.demoMbaits.server;


import com.example.demoMbaits.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectById(Long id) {
        User user = userMapper.selectById(id);
       /* User user = new User();
        user.setStatus(1);
        user.setId(12L);*/
        return user;
    }
}
