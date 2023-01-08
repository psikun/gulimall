package com.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.order.entity.OmsRefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author psikun
 * @email psikun@foxmail.com
 * @date 2023-01-08 13:43:22
 */
public interface OmsRefundInfoService extends IService<OmsRefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

