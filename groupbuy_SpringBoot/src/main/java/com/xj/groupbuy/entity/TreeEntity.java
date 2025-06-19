package com.xj.groupbuy.entity;

import java.util.List;

/**
 * Author : 220512309dyx
 * Date : 2025/5/28
 */
public interface TreeEntity<E> {
    Integer getTreeId();
    Integer getTreeParentId();
    default boolean isTreeEnabled(){
        return true;
    }
    void setTreeChildren(List<E> children);
}
