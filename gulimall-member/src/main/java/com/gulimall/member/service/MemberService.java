package com.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author psikun
 * @email psikun@foxmail.com
 * @date 2023-01-08 13:41:22
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

