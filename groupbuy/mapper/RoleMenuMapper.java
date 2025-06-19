package com.xj.groupbuy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xj.groupbuy.entity.RoleMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 220512309dyx
 * @since 2025-06-11
 */
@Mapper
public interface RoleMenuMapper extends BaseMapper<RoleMenu> {

    List<Integer> getMenuIdsByRoleId(Integer roleId,boolean onlyLeaf);
}
