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
 * 酒店表
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("itrip_hotel")
@ApiModel(value = "Hotel对象", description = "酒店表")
public class Hotel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "酒店名称")
    private String hotelName;

    @ApiModelProperty(value = "所在国家id")
    private Long countryId;

    @ApiModelProperty(value = "所在省份id")
    private Long provinceId;

    @ApiModelProperty(value = "所在城市id")
    private Long cityId;

    @ApiModelProperty(value = "酒店所在地址")
    private String address;

    @ApiModelProperty(value = "酒店介绍（保存附文本）")
    private String details;

    @ApiModelProperty(value = "酒店设施")
    private String facilities;

    @ApiModelProperty(value = "酒店政策")
    private String hotelPolicy;

    @ApiModelProperty(value = "酒店类型(1:国内酒店 2:国际酒店)")
    private Integer hotelType;

    @ApiModelProperty(value = "(1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)")
    private Integer hotelLevel;

    @ApiModelProperty(value = "是否是团购酒店")
    private Integer isGroupPurchase;

    @ApiModelProperty(value = "城市名称 冗余字段")
    private String redundantCityName;

    @ApiModelProperty(value = "省名称 冗余字段")
    private String redundantProvinceName;

    @ApiModelProperty(value = "国家名称 冗余字段")
    private String redundantCountryName;

    @ApiModelProperty(value = "酒店库存（冗余，每天开定时任务的时候更新）")
    private Integer redundantHotelStore;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;

    @ApiModelProperty(value = "逻辑删除（0:未删除；1：删除）")
    private Integer isDeleted;


}
