package com.royal.royalmall.coupon.dao;

import com.royal.royalmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-09-01 20:44:34
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
