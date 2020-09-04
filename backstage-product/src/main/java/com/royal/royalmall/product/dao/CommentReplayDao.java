package com.royal.royalmall.product.dao;

import com.royal.royalmall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-08-28 16:17:53
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
