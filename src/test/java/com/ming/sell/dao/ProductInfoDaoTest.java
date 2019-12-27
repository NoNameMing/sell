package com.ming.sell.dao;

import com.ming.sell.dataobject.ProductCategory;
import com.ming.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDaoTest {
    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("233");
        productInfo.setProductName("测试添加");
        productInfo.setProductPrice(new BigDecimal(2.33));
        productInfo.setProductStock(99);
        productInfo.setProductDescription("测试添加描述");
        productInfo.setProductIcon("testing");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo result = productInfoDao.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatus() throws Exception{
        List<ProductInfo> result = productInfoDao.findByProductStatus(0);
        Assert.assertNotEquals(0, result.size());
    }
}