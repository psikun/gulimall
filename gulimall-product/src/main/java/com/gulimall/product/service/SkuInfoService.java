package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author psikun
 * @email psikun@foxmail.com
 * @date 2023-01-08 12:21:22
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

