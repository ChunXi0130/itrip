package com.cskt.itrip.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cskt.itrip.entity.TradeEnds;

/**
 * <p>
 * 订单支付完成后，系统需对该订单进行后续处理，如减库存等。处理完成后，删除此表中的订单记录 服务类
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
public interface TradeEndsService extends IService<TradeEnds> {

}
