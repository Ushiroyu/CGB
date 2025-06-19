package com.xj.groupbuy.controller.staff;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xj.groupbuy.common.vo.CommonVO;
import com.xj.groupbuy.entity.Notice;
import com.xj.groupbuy.service.INoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 220512309dyx
 * @since 2025-06-05
 */
@RestController
@RequestMapping("staff/notice")
public class StaffNoticeController {
    
    @Autowired
    private INoticeService noticeService;
    
    @GetMapping("all/{pageNo}/{pageSize}")
    public IPage<?> getNotices(Integer mode,@PathVariable(value = "pageNo") Integer pageNo, @PathVariable(value = "pageSize") Integer pageSize) {
        return noticeService.getNotices(mode,pageNo,pageSize);
    }
}
