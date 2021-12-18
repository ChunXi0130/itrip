package com.cskt.itrip.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 订单支付完成后，系统需对该订单进行后续处理，如减库存等。处理完成后，删除此表中的订单记录 前端控制器
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@RestController
@RequestMapping("/itrip/trade-ends")
public class TradeEndsController {

}

