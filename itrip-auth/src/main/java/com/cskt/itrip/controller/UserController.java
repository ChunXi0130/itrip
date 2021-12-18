package com.cskt.itrip.controller;


import com.cskt.itrip.common.vo.ReturnResult;
import com.cskt.itrip.entity.User;
import com.cskt.itrip.entity.vo.UserRegisterCondition;
import com.cskt.itrip.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@RestController
@RequestMapping("/api")
@Api(value = "提供用户登录 注册的相关接口", tags = "用户管理")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/ckusr")
    @ApiOperation("查询用户是否存在")
    public ReturnResult checkUser(String name) {
        User user = userService.getUser(name);
        return ReturnResult.ok(user);
    }

    @PostMapping("/doRegister")
    @ApiOperation(value = "用户邮箱注册")
    public ReturnResult doRegister(@RequestBody UserRegisterCondition userRegisterCondition) {
        User user = userService.userRegister(userRegisterCondition);
        return ReturnResult.ok(user);
    }

}

