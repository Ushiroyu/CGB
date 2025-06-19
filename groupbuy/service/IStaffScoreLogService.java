package com.xj.groupbuy.service;

import com.xj.groupbuy.common.vo.CommonVO;
import com.xj.groupbuy.entity.StaffScoreLog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 220512309dyx
 * @since 2025-06-12
 */
public interface IStaffScoreLogService extends IService<StaffScoreLog> {

    CommonVO getStaffScoreLogs(String userId);

    CommonVO insertStaffScoreLog(StaffScoreLog staffScoreLog);
}
