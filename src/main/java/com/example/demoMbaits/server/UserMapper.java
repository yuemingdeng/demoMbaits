package com.example.demoMbaits.server;

import com.example.demoMbaits.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectById(Long id);
}
