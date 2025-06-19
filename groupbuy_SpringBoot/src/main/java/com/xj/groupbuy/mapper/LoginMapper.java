package com.xj.groupbuy.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * Author : 220512309dyx
 * Date : 2025/5/26
 */
@Mapper
public interface LoginMapper {
    String checkLogin(String token);
}
