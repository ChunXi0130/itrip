package com.cskt.itrip.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("itrip_user_link_user")
@ApiModel(value = "UserLinkUser对象", description = "")
public class UserLinkUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "常用联系人姓名")
    private String linkUserName;

    @ApiModelProperty(value = "证件号码")
    private String linkIdCard;

    @ApiModelProperty(value = "常用联系人电话")
    private String linkPhone;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;

    @ApiModelProperty(value = "逻辑删除（0:未删除；1：删除）")
    private Integer isDeleted;

    @ApiModelProperty(value = "证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)")
    private Integer linkIdCardType;


}
