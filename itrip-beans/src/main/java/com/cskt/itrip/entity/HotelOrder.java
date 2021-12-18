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
 * 订单表
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("itrip_hotel_order")
@ApiModel(value = "HotelOrder对象", description = "订单表")
public class HotelOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "订单类型(0:旅游产品 1:酒店产品 2：机票产品)")
    private Integer orderType;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "交易编号")
    private String tradeNo;

    @ApiModelProperty(value = "冗余字段 酒店id")
    private Long hotelId;

    @ApiModelProperty(value = "冗余字段 酒店名称")
    private String hotelName;

    @ApiModelProperty(value = "房间id")
    private Long roomId;

    @ApiModelProperty(value = "消耗数量")
    private Integer count;

    @ApiModelProperty(value = "预订天数")
    private Integer bookingDays;

    @ApiModelProperty(value = "入住时间")
    private Date checkInDate;

    @ApiModelProperty(value = "退房时间")
    private Date checkOutDate;

    @ApiModelProperty(value = "订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）")
    private Integer orderStatus;

    @ApiModelProperty(value = "支付金额")
    private BigDecimal payAmount;

    @ApiModelProperty(value = "支付方式:1:支付宝 2:微信 3:到店付")
    private Integer payType;

    @ApiModelProperty(value = "联系手机号")
    private String noticePhone;

    @ApiModelProperty(value = "联系邮箱")
    private String noticeEmail;

    @ApiModelProperty(value = "特殊需求")
    private String specialRequirement;

    @ApiModelProperty(value = "是否需要发票（0：不需要 1：需要）")
    private Integer isNeedInvoice;

    @ApiModelProperty(value = "发票类型（0：个人 1：公司）")
    private Integer invoiceType;

    @ApiModelProperty(value = "发票抬头")
    private String invoiceHead;

    @ApiModelProperty(value = "入住人名称")
    private String linkUserName;

    @ApiModelProperty(value = "0:WEB端 1:手机端 2:其他客户端")
    private Integer bookType;

    @ApiModelProperty(value = "预定时间")
    private Date creationDate;

    private Long createdBy;

    @ApiModelProperty(value = "支付完成时间")
    private Date modifyDate;

    private Long modifiedBy;

    @ApiModelProperty(value = "逻辑删除（0:未删除；1：删除）")
    private Integer isDeleted;


}
