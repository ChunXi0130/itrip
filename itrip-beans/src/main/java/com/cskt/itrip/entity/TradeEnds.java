package com.cskt.itrip.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 订单支付完成后，系统需对该订单进行后续处理，如减库存等。处理完成后，删除此表中的订单记录
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("itrip_trade_ends")
@ApiModel(value = "TradeEnds对象", description = "订单支付完成后，系统需对该订单进行后续处理，如减库存等。处理完成后，删除此表中的订单记录")
public class TradeEnds implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "订单编号(注意非支付宝交易编号tradeNo)")
    private String orderNo;

    @ApiModelProperty(value = "标识字段(默认0：未处理；1：处理中)")
    private Boolean flag;

    @ApiModelProperty(value = "逻辑删除（0:未删除；1：删除）")
    private Integer isDeleted;


}
