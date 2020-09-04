package com.royal.royalmall.user.dao;

import com.royal.royalmall.user.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-09-01 20:46:47
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
