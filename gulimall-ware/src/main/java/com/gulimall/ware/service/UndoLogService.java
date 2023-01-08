package com.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * @author psikun
 * @email psikun@foxmail.com
 * @date 2023-01-08 13:47:37
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

