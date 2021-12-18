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
 * 区域字典表
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("itrip_area_dic")
@ApiModel(value = "AreaDic对象", description = "区域字典表")
public class AreaDic implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "区域名称")
    private String name;

    @ApiModelProperty(value = "区域编号")
    private String areaNo;

    @ApiModelProperty(value = "父级区域")
    private Long parent;

    @ApiModelProperty(value = "0:未激活 1:已激活")
    private Integer isActivated;

    @ApiModelProperty(value = "是否是商圈(0:不是 1:是)")
    private Integer isTradingArea;

    @ApiModelProperty(value = "(0:不是 1：是)")
    private Integer isHot;

    @ApiModelProperty(value = "区域级别(0:国家级 1:省级 2:市级 3:县/区)")
    private Integer level;

    @ApiModelProperty(value = "1:国内 2：国外")
    private Integer isChina;

    private String pinyin;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;

    @ApiModelProperty(value = "逻辑删除（0:未删除；1：删除）")
    private Integer isDeleted;


}
