package com.royal.royalmall.order.dao;

import com.royal.royalmall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-09-01 20:40:58
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
