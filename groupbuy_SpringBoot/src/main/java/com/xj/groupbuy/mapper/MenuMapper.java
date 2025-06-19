package com.xj.groupbuy.mapper;

import com.xj.groupbuy.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> getAllMenusWithRole();

    List<Menu> getMenusByUserId(String userId);

    List<Menu> getAllMenusIdAndName();


}
