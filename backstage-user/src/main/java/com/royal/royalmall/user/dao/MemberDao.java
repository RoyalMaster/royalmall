package com.royal.royalmall.user.dao;

import com.royal.royalmall.user.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-09-01 20:46:47
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
