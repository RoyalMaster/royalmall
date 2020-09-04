package com.royal.royalmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.royal.royalmall.common.utils.PageUtils;
import com.royal.royalmall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-09-01 20:44:34
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

