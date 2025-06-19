package com.xj.groupbuy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xj.groupbuy.entity.TTest;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author : 220512309dyx
 * Date : 2025/6/1
 */
//@Repository
@Mapper
public interface TestMapper extends BaseMapper<TTest> {
    
    
    TTest getTest(String id);
}
