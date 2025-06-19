package com.xj.groupbuy.service;

import com.xj.groupbuy.common.vo.CommonVO;

/**
 * Author : 220512309dyx
 * Date : 2025/5/26
 */
public interface IDataAnalysisService {
    CommonVO getStoreDayAnalysis(String storeId);

    CommonVO getStoreMonthAnalysis(String storeId);
}
