package com.xj.groupbuy.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Author : 220512309dyx
 * Date : 2025/5/28
 */

@Data
public class Meta implements Serializable {
    
    private static final long serialVersionUID = 4481526064896844012L;
    
    private Boolean keepAlive;

    private Boolean requireAuth;
}
