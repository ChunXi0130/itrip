package com.cskt.itrip.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 酒店房间表
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("itrip_hotel_room")
@ApiModel(value = "HotelRoom对象", description = "酒店房间表")
public class HotelRoom implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "酒店ID")
    private Long hotelId;

    @ApiModelProperty(value = "房间名称")
    private String roomTitle;

    @ApiModelProperty(value = "房间价格")
    private BigDecimal roomPrice;

    @ApiModelProperty(value = "酒店床型")
    private Long roomBedTypeId;

    @ApiModelProperty(value = "是否包含早餐")
    private Integer isHavingBreakfast;

    @ApiModelProperty(value = "1:在线付 2:到店付 3:不限")
    private Integer payType;

    @ApiModelProperty(value = "满意度（冗余字段，在用户评论后更新）")
    private BigDecimal satisfaction;

    @ApiModelProperty(value = "是否可预订(0:不可以 1:可以)")
    private Integer isBook;

    @ApiModelProperty(value = "是否可取消(0:不可 1:可以)")
    private Integer isCancel;

    @ApiModelProperty(value = "是否及时响应(0:不及时 1:及时)")
    private Integer isTimelyResponse;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;

    @ApiModelProperty(value = "逻辑删除（0:未删除；1：删除）")
    private Integer isDeleted;


}
