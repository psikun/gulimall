package com.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author psikun
 * @email psikun@foxmail.com
 * @date 2023-01-08 13:41:22
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

