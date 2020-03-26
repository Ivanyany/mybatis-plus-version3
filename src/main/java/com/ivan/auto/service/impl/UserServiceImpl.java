package com.ivan.auto.service.impl;

import com.ivan.auto.bean.User;
import com.ivan.auto.mapper.UserMapper;
import com.ivan.auto.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Ivan
 * @since 2020-03-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
