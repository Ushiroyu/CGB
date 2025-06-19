package com.xj.groupbuy.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xj.groupbuy.entity.StaffScore;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xj.groupbuy.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 220512309dyx
 * @since 2025-06-12
 */
@Mapper
public interface StaffScoreMapper extends BaseMapper<StaffScore> {

    IPage<?> getStaffScores(Page<?> page);
}
