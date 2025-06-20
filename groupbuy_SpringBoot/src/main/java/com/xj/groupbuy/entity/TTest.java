package com.xj.groupbuy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Author : 220512309dyx
 * Date : 2025/6/1
 */
@Data
@TableName("T_TEST")
public class TTest {
    
    private String id;
    private String name;
    private int age;
    
    @TableField(exist = false)
    private String userName;
}
