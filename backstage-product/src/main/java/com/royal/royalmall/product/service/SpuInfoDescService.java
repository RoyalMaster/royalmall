package com.royal.royalmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.royal.royalmall.common.utils.PageUtils;
import com.royal.royalmall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-08-28 16:17:53
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

