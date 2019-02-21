package com.example.demoMbaits.web;

import com.example.demoMbaits.domain.User;
import com.example.demoMbaits.server.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  //默认类中的方法都以json格式返回
@RequestMapping(value = "/house/shortRent")
public class ShortRentConrtoller {
    @Value("${com.neo.title}")
    private String name;

    @Value("${com.neo.description}")
    private String describe;

    @Autowired
    private UserService userService;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private String testString = "testString";
    private String userKey = "Key002";


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {

        //1,添加一个Value为String
        stringRedisTemplate.opsForValue().set(testString, "测试存储字符串类型");
        //2,添加一个Value为对象
        User user = new User();
        user.setId(1L);
        user.setAccount("张三");
        user.setPwd("1111");
        user.setStatus(1);
        user.setSetRediskey(userKey);
        redisTemplate.opsForValue().set(user.getSetRediskey(), user);
        return "success";
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User findUserByKey() {
        User value = (User) redisTemplate.opsForValue().get(userKey);
        return value;
    }


    /**
     * time: 2018/11/20
     * author:yuemingdeng
     */
    @ApiOperation(value = "测试接口hello", notes = "测试接口")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User get() {
        String ss = "123";
        return userService.selectById(1L);
    }


}
