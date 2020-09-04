package com.royal.royalmall.product;

import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.royal.royalmall.product.entity.BrandEntity;
import com.royal.royalmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BackstageProductApplicationTests {

    @Autowired
    BrandService  brandService;
    @Test
    void contextLoads() {
        BrandEntity baEntity = new BrandEntity();
//        baEntity.setName("华为");
//        baEntity.setDescript("华为手机");
//        brandService.save(baEntity);
        List<BrandEntity> list = brandService.list();
        for (BrandEntity brandEntity : list){
            System.out.println(brandEntity);
        }
    }

}
