package com.xj.groupbuy.common.util;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.List;

/**
 * Author : 220512309dyx
 * Date : 2025/5/25
 */
public class CloneUtil {

    /**
     * 复制对象
     */
    public static <T,K> T clone(K source, Class<T> clazz) {
        T t = BeanUtils.instantiateClass(clazz);
        BeanUtils.copyProperties(source, t);
        return t;
    }

    /**
     * 复制集合
     */
//    public static <T,K> List<T> copyList(List<K> sourceList, Class<T> clazz) {
//        if (CollectionUtils.isEmpty(sourceList)) {
//            return null;
//        }
//        return Lists2.transform(sourceList,input -> convert(input, clazz));
//    }
}
