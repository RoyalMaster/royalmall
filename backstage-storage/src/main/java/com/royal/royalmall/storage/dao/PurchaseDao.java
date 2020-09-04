package com.royal.royalmall.storage.dao;

import com.royal.royalmall.storage.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-09-01 20:48:25
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
