package com.cskt.itrip.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cskt.itrip.entity.Image;
import com.cskt.itrip.mapper.ImageMapper;
import com.cskt.itrip.service.ImageService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图片表 服务实现类
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@Service
public class ImageServiceImpl extends ServiceImpl<ImageMapper, Image> implements ImageService {

}
