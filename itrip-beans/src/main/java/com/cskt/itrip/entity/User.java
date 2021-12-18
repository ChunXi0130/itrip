package com.cskt.itrip.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("itrip_user")
@ApiModel(value = "User对象", description = "用户表")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号")
    private String userCode;

    @ApiModelProperty(value = "若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码")
    private String userPassword;

    @ApiModelProperty(value = "用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）")
    private Integer userType;

    @ApiModelProperty(value = "平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）")
    private Long flatId;

    @ApiModelProperty(value = "用户昵称")
    private String userName;

    @ApiModelProperty(value = "微信号")
    private String weChat;

    @ApiModelProperty(value = "qq账号")
    private String qq;

    @ApiModelProperty(value = "微博账号")
    private String weibo;

    @ApiModelProperty(value = "百度账号")
    private String baidu;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "创建时间")
    private Date creationDate;

    private Long createdBy;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "修改时间")
    private Date modifyDate;

    private Long modifiedBy;

    @ApiModelProperty(value = "是否激活,(0 false，1 true,默认是0)")
    private Integer activated;

    @ApiModelProperty(value = "逻辑删除")
    @TableLogic
    private Integer isDeleted;

}
