package com.cskt.itrip.service.impl;

import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cskt.itrip.common.constants.ErrorCodeEnum;
import com.cskt.itrip.common.exception.ServiceException;
import com.cskt.itrip.entity.User;
import com.cskt.itrip.entity.vo.UserRegisterCondition;
import com.cskt.itrip.mapper.UserMapper;
import com.cskt.itrip.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

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

    @Override
    public User getUser(String name) {
        if (!StringUtils.hasLength(name)) {
            throw new ServiceException(ErrorCodeEnum.AUTH_PARAMETER_IS_EMPTY);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_code", name);
        User user = baseMapper.selectOne(queryWrapper);
        if (user != null) {
            throw new ServiceException(ErrorCodeEnum.AUTH_USER_ALREADY_EXISTS);
        }
        return null;
    }

//    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
//    String activeCodeKeyPre = "active:";
//    @Value(value = "${email.send.enable}")
//    private boolean enableSendEmail;

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public User userRegister(UserRegisterCondition condition) {
        if (!StringUtils.hasLength(condition.getUserCode())) {
            throw new ServiceException(ErrorCodeEnum.AUTH_PARAMETER_IS_EMPTY);
        } else if (!StringUtils.hasLength(condition.getUserPassword())) {
            throw new ServiceException(ErrorCodeEnum.AUTH_PARAMETER_ERROR);
        } else if (!StringUtils.hasLength(condition.getUserName())) {
            throw new ServiceException(ErrorCodeEnum.AUTH_PARAMETER_IS_EMPTY);
        }
        String md5Password = SecureUtil.md5(condition.getUserPassword());
        condition.setUserPassword(md5Password);
        User user = new User();
        BeanUtils.copyProperties(condition, user);
        baseMapper.insert(user);
        return user;
    }
}
