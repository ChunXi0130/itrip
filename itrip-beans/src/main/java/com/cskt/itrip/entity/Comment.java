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
 * 评论表
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("itrip_comment")
@ApiModel(value = "Comment对象", description = "评论表")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "如果产品是酒店的话 改字段保存酒店id")
    private Long hotelId;

    @ApiModelProperty(value = "商品id")
    private Long productId;

    @ApiModelProperty(value = "订单id")
    private Long orderId;

    @ApiModelProperty(value = "商品类型(0:旅游产品 1:酒店产品 2:机票产品)")
    private Integer productType;

    @ApiModelProperty(value = "评论内容")
    private String content;

    @ApiModelProperty(value = "用户编号")
    private Long userId;

    @ApiModelProperty(value = "是否包含图片(当用户上传评论时检测)0:无图片 1:有图片")
    private Integer isHavingImg;

    @ApiModelProperty(value = "位置评分")
    private Integer positionScore;

    @ApiModelProperty(value = "设施评分")
    private Integer facilitiesScore;

    @ApiModelProperty(value = "服务评分")
    private Integer serviceScore;

    @ApiModelProperty(value = "卫生评分")
    private Integer hygieneScore;

    @ApiModelProperty(value = "综合评分")
    private Integer score;

    @ApiModelProperty(value = "出游类型")
    private Long tripMode;

    @ApiModelProperty(value = "是否满意（0：有待改善 1：值得推荐）")
    private Integer isOk;

    private Date creationDate;

    private Long createdBy;

    private Date modifyDate;

    private Long modifiedBy;

    @ApiModelProperty(value = "逻辑删除（0:未删除；1：删除）")
    private Integer isDeleted;


}
