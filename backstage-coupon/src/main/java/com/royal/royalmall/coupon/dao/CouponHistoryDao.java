package com.royal.royalmall.coupon.dao;

import com.royal.royalmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-09-01 20:44:34
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
