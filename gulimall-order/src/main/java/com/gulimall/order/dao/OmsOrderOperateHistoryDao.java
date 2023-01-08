package com.gulimall.order.dao;

import com.gulimall.order.entity.OmsOrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 *
 * @author psikun
 * @email psikun@foxmail.com
 * @date 2023-01-08 13:43:22
 */
@Mapper
public interface OmsOrderOperateHistoryDao extends BaseMapper<OmsOrderOperateHistoryEntity> {

}
