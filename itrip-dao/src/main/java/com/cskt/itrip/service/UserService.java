package com.cskt.itrip.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cskt.itrip.common.vo.ReturnResult;
import com.cskt.itrip.entity.User;
import com.cskt.itrip.entity.vo.UserRegisterCondition;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
public interface UserService extends IService<User> {

    /**
     * 查询用户是否存在
     *
     * @param name 用户名
     * @return 用户对象
     */
    User getUser(String name);

    /**
     * 用户注册
     * @param condition vo类
     * @return 对象
     */
    User userRegister(UserRegisterCondition condition);

}
