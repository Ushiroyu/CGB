package com.xj.groupbuy.mapper;

import com.xj.groupbuy.entity.Cart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 220512309dyx
 * @since 2025-06-07
 */
@Mapper
public interface CartMapper extends BaseMapper<Cart> {

    Cart selectCartWithItems(String userId);

    Integer selectStoreCount(Integer cartId);
}
