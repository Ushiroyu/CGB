package com.xj.groupbuy.service;

import com.xj.groupbuy.common.vo.CommonVO;
import com.xj.groupbuy.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 220512309dyx
 * @since 2025-06-11
 */
public interface IRoleService extends IService<Role> {

    CommonVO deleteRole(Integer roleId);
}
