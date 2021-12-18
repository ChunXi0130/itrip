package com.cskt.itrip.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cskt.itrip.entity.User;
import com.cskt.itrip.mapper.UserMapper;
import com.cskt.itrip.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
