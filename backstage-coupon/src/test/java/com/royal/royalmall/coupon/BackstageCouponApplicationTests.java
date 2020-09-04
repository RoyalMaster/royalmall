package com.royal.royalmall.coupon;

import com.royal.royalmall.coupon.entity.CouponEntity;
import com.royal.royalmall.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class BackstageCouponApplicationTests {
    @Autowired
    CouponService couponService;
    @Test
    void contextLoads() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setAmount(new BigDecimal(199));
        couponEntity.setCouponName("电脑优惠券");
        couponEntity.setCouponType(0);
        couponService.save(couponEntity);
    }

}
