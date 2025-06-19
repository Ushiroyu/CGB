package com.xj.groupbuy.service;

import com.xj.groupbuy.common.vo.CommonVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author : 220512309dyx
 * Date : 2025/6/6
 */
public interface ILoginService {
    CommonVO checkLogin(HttpServletRequest request,HttpServletResponse response);
}
