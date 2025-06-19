package com.xj.groupbuy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xj.groupbuy.common.vo.CommonVO;
import com.xj.groupbuy.entity.RoleMenu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 220512309dyx
 * @since 2025-06-14
 */
public interface IRoleMenuService extends IService<RoleMenu> {

    CommonVO updateRoleMenu(Integer roleId, List<Integer> menuIds);
}
