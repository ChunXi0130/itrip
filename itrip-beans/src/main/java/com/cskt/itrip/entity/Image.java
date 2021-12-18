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
 * 图片表
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("itrip_image")
@ApiModel(value = "Image对象", description = "图片表")
public class Image implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "图片类型(0:酒店图片1:房间图片2:评论图片)")
    private String type;

    @ApiModelProperty(value = "关联id")
    private Long targetId;

    @ApiModelProperty(value = "图片s上传顺序位置")
    private Integer position;

    @ApiModelProperty(value = "图片地址")
    private String imgUrl;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;

    @ApiModelProperty(value = "逻辑删除（0:未删除；1：删除）")
    private Integer isDeleted;


}
