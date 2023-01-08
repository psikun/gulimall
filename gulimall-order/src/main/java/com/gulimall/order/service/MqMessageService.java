package com.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * @author psikun
 * @email psikun@foxmail.com
 * @date 2023-01-08 13:45:54
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

