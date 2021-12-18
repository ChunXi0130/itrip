package com.cskt.itrip.entity.vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Lenovo
 * @version 1.0
 * @date 2021/12/20 14:48
 */
@ApiModel(value = "UserRegisterCondition",description = "用户注册信息")
@Data
public class UserRegisterCondition implements Serializable {

    /**
     * {userCode: "745729377@qq.com", userName: "张三", userPassword: "111111"}
     */
    @ApiModelProperty(value = "用户账号")
    private String userCode;
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "密码")
    private String userPassword;
}
