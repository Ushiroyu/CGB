package com.xj.groupbuy.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Author : 220512309dyx
 * Date : 2025/6/16
 */
@Mapper
public interface RegionMapper {
    List<Map<String, Object>> getAllProvinces();

    List<Map<String, Object>> getCitysByProvinceCode(String provinceCode);

    List<Map<String, Object>> getAreasByCityCode(String cityCode);

    List<Map<String, Object>> getStreetsByAreaCode(String areaCode);

    List<Map<String, Object>> getCommunityByStreetCode(String streetCode);
}
