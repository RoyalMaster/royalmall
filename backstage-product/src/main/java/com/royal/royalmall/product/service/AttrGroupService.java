package com.royal.royalmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.royal.royalmall.common.utils.PageUtils;
import com.royal.royalmall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-08-28 16:17:53
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

