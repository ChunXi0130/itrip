package com.cskt.itrip.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cskt.itrip.entity.Hotel;
import com.cskt.itrip.mapper.HotelMapper;
import com.cskt.itrip.service.HotelService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 酒店表 服务实现类
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@Service
public class HotelServiceImpl extends ServiceImpl<HotelMapper, Hotel> implements HotelService {

}
