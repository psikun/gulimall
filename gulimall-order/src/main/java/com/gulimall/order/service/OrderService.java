package com.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author psikun
 * @email psikun@foxmail.com
 * @date 2023-01-08 13:45:54
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

