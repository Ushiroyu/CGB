package com.xj.groupbuy.service.impl;

import com.xj.groupbuy.entity.CommunityGoods;
import com.xj.groupbuy.mapper.CommunityGoodsMapper;
import com.xj.groupbuy.service.ICommunityGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 220512309dyx
 * @since 2025-05-30
 */
@Service
@Primary
public class CommunityGoodsServiceImpl extends ServiceImpl<CommunityGoodsMapper, CommunityGoods> implements ICommunityGoodsService {

}
