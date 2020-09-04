package com.royal.royalmall.storage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.royal.royalmall.common.utils.PageUtils;
import com.royal.royalmall.storage.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-09-01 20:48:25
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

