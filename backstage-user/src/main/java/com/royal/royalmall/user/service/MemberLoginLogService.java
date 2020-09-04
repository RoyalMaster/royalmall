package com.royal.royalmall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.royal.royalmall.common.utils.PageUtils;
import com.royal.royalmall.user.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-09-01 20:46:47
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

