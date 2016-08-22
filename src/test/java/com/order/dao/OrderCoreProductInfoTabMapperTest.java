package com.order.dao;

import com.order.core.dao.OrderCoreProductInfoTabMapper;
import com.order.core.entity.OrderCoreProductInfoTab;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class OrderCoreProductInfoTabMapperTest {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OrderCoreProductInfoTabMapper orderCoreProductInfoTabMapper;

    @Test
    public void testInsert() throws Exception {
        OrderCoreProductInfoTab productInfoTab = new OrderCoreProductInfoTab(1001, "产品1号", "0001", 1, "admin", new Date(), new Date());
        int result = orderCoreProductInfoTabMapper.insert(productInfoTab);
        logger.debug("result={}", result);
    }

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        Integer productId = 1001;
        OrderCoreProductInfoTab productInfoTab = orderCoreProductInfoTabMapper.selectByPrimaryKey(productId);
        logger.debug("productInfoTab={}", productInfoTab);
    }
}