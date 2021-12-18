package com.cskt.itrip.controller;


import com.cskt.itrip.common.vo.ReturnResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 区域字典表 前端控制器
 * </p>
 *
 * @author CunXi
 * @since 2021-12-15
 */
@RestController
@RequestMapping("/itrip/area-dic")
public class AreaDicController {

    public ReturnResult address() {
        return ReturnResult.ok();
    }

}

