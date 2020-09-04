package com.royal.royalmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.royal.royalmall.common.utils.PageUtils;
import com.royal.royalmall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-09-01 20:44:34
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

