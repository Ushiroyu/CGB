package com.xj.groupbuy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xj.groupbuy.entity.Community;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 220512309dyx
 * @since 2025-06-15
 */
public interface ICommunityService extends IService<Community> {

    IPage<?> table(String level, String parentCode, Integer pageNo, Integer pageSize);
}
