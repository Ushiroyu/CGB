package com.xj.groupbuy.mapper;

import com.xj.groupbuy.entity.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 220512309dyx
 * @since 2025-06-02
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {

    List<Integer> getUserRolesIdById(String userId);

}
