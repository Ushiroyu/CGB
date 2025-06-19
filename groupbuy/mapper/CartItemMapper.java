package com.xj.groupbuy.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xj.groupbuy.entity.CartItem;
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
 * @since 2025-05-30
 */
@Mapper
public interface CartItemMapper extends BaseMapper<CartItem> {

    IPage<?> getCartItems(Integer cartId, Page<Map<String, Object>> page);
}
