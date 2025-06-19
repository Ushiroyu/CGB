package com.xj.groupbuy.mapper;

import com.xj.groupbuy.entity.Category;
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
 * @since 2025-06-09
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

    Map<String, Object> getParentLevelId(Integer id);

    List<Map<String, Object>> getAllOne();

    List<Map<String, Object>> getTwoByOne(Integer one);

    List<Map<String, Object>> getThreeByTwo(Integer two);
}
