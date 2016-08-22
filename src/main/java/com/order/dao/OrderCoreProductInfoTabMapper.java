package com.order.dao;

import com.order.entity.OrderCoreProductInfoTab;

public interface OrderCoreProductInfoTabMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(OrderCoreProductInfoTab record);

    int insertSelective(OrderCoreProductInfoTab record);

    OrderCoreProductInfoTab selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(OrderCoreProductInfoTab record);

    int updateByPrimaryKey(OrderCoreProductInfoTab record);
}