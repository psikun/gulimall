package com.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.order.entity.OmsOrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author psikun
 * @email psikun@foxmail.com
 * @date 2023-01-08 13:43:22
 */
public interface OmsOrderService extends IService<OmsOrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

