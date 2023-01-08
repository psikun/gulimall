package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * @author psikun
 * @email psikun@foxmail.com
 * @date 2023-01-08 12:21:22
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

