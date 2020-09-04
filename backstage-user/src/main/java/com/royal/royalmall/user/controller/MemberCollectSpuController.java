package com.royal.royalmall.user.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.royal.royalmall.user.entity.MemberCollectSpuEntity;
import com.royal.royalmall.user.service.MemberCollectSpuService;
import com.royal.royalmall.common.utils.PageUtils;
import com.royal.royalmall.common.utils.R;



/**
 * 会员收藏的商品
 *
 * @author jia.huang
 * @email jia.huang@gmail.com
 * @date 2020-09-01 20:46:47
 */
@RestController
@RequestMapping("user/membercollectspu")
public class MemberCollectSpuController {
    @Autowired
    private MemberCollectSpuService memberCollectSpuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("user:membercollectspu:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberCollectSpuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("user:membercollectspu:info")
    public R info(@PathVariable("id") Long id){
		MemberCollectSpuEntity memberCollectSpu = memberCollectSpuService.getById(id);

        return R.ok().put("memberCollectSpu", memberCollectSpu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("user:membercollectspu:save")
    public R save(@RequestBody MemberCollectSpuEntity memberCollectSpu){
		memberCollectSpuService.save(memberCollectSpu);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("user:membercollectspu:update")
    public R update(@RequestBody MemberCollectSpuEntity memberCollectSpu){
		memberCollectSpuService.updateById(memberCollectSpu);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("user:membercollectspu:delete")
    public R delete(@RequestBody Long[] ids){
		memberCollectSpuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
