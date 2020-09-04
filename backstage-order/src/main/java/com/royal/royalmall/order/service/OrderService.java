package com.royal.royalmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.royal.royalmall.common.utils.PageUtils;
import com.royal.royalmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-09-01 20:40:58
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

