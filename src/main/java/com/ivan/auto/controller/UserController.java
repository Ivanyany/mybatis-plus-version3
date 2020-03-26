package com.ivan.auto.controller;


import com.ivan.auto.bean.User;
import com.ivan.auto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Ivan
 * @since 2020-03-26
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    @ResponseBody
    public List<User> getUsers(){
        List<User> userList = userService.list();

        return userList;
    }

}

