package com.gulimall.order.dao;

import com.gulimall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author psikun
 * @email psikun@foxmail.com
 * @date 2023-01-08 13:45:54
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {

}
