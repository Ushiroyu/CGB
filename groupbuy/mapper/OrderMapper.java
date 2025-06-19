package com.xj.groupbuy.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xj.groupbuy.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 220512309dyx
 * @since 2025-05-29
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    IPage<?> getTable(String userId,Page<Order> page);

    IPage<?> getStoreOrderTable(String storeId, Page<Order> page);
}
