package com.ivan;

import com.ivan.bean.User;
import com.ivan.mapper.MyUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author Ivan
 * @Date 2020/3/26 11:14
 */
@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private MyUserMapper userMapper;

    @Test
    void contextLoads() {

        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}
