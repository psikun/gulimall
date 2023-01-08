package com.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.order.entity.OmsPaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author psikun
 * @email psikun@foxmail.com
 * @date 2023-01-08 13:43:22
 */
public interface OmsPaymentInfoService extends IService<OmsPaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

