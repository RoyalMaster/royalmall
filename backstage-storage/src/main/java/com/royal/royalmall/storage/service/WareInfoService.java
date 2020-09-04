package com.royal.royalmall.storage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.royal.royalmall.common.utils.PageUtils;
import com.royal.royalmall.storage.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-09-01 20:48:25
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

