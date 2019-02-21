package com.example.demoMbaits.web;

import com.example.demoMbaits.Application;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class RedisTest {

    @Autowired
    RedisConnectionFactory factory;

    @org.junit.Test
    public void testRedis(){
        //得到一个连接
        RedisConnection conn = factory.getConnection();
        conn.set("hello".getBytes(), "world".getBytes());
        System.out.println(new String(conn.get("hello".getBytes())));
    }

}
