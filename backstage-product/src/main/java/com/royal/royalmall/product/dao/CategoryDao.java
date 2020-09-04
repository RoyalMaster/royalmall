package com.royal.royalmall.product.dao;

import com.royal.royalmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-08-28 16:17:53
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
