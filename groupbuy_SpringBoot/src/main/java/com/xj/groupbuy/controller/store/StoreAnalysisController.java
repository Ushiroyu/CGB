package com.xj.groupbuy.controller.store;

import com.xj.groupbuy.common.util.UserUtil;
import com.xj.groupbuy.common.vo.CommonVO;
import com.xj.groupbuy.service.IDataAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : 220512309dyx
 * Date : 2025/5/26
 */
@RestController
@RequestMapping("store/analysis")
public class StoreAnalysisController {
    
    @Autowired
    private IDataAnalysisService dataAnalysisService;
    
    @GetMapping("day")
    public CommonVO getStoreDayAnalysis(){
        return dataAnalysisService.getStoreDayAnalysis(UserUtil.getUserId());
    }
    @GetMapping("month")
    public CommonVO getStoreMonthAnalysis(){
        return dataAnalysisService.getStoreMonthAnalysis(UserUtil.getUserId());
    }
}
