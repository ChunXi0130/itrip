package com.cskt.itrip.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cskt.itrip.entity.ProductStore;
import com.cskt.itrip.mapper.ProductStoreMapper;
import com.cskt.itrip.service.ProductStoreService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 原始库存表 服务实现类
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@Service
public class ProductStoreServiceImpl extends ServiceImpl<ProductStoreMapper, ProductStore> implements ProductStoreService {

}
