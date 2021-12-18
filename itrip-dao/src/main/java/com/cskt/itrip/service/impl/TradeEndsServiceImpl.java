package com.cskt.itrip.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cskt.itrip.entity.TradeEnds;
import com.cskt.itrip.mapper.TradeEndsMapper;
import com.cskt.itrip.service.TradeEndsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单支付完成后，系统需对该订单进行后续处理，如减库存等。处理完成后，删除此表中的订单记录 服务实现类
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@Service
public class TradeEndsServiceImpl extends ServiceImpl<TradeEndsMapper, TradeEnds> implements TradeEndsService {

}
