package com.cskt.itrip.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cskt.itrip.common.constants.ErrorCodeEnum;
import com.cskt.itrip.common.vo.ReturnResult;
import com.cskt.itrip.entity.User;
import com.cskt.itrip.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@RestController
@RequestMapping("/itrip/user")
@Api("用户登录 注册")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/checkUser/{name}")
    @ApiOperation("查询用户是否存在")
    public ReturnResult checkUser(@PathVariable String name) {
        if (StringUtils.isEmpty(name)) {
            return ReturnResult.error(ErrorCodeEnum.AUTH_PARAMETER_IS_EMPTY);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_code", name);
        User user = userService.getOne(queryWrapper);
        if (user !=  null) {
            return ReturnResult.error(ErrorCodeEnum.AUTH_USER_ALREADY_EXISTS);
        }
        return ReturnResult.ok();
    }
}

