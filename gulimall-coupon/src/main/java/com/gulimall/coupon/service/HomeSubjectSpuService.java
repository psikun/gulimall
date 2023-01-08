package com.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author psikun
 * @email psikun@foxmail.com
 * @date 2023-01-08 13:35:53
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

