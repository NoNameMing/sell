package com.ming.sell.dao;

import com.ming.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    // 查找 Id 为 1 的商品类别
    @Test
    @Ignore
    public void findOneTest() {
        ProductCategory productCategory = productCategoryDao.findOne(1);
        System.out.println(productCategory.toString());
    }

    // 向数据库中添加新的一行数据
    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("提前预定", 6);
        ProductCategory result = productCategoryDao.save(productCategory);
        System.out.println(result.toString());
//        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<ProductCategory> result = productCategoryDao.findByCategoryTypeIn(list);
        System.out.println(result.size());
        Assert.assertNotEquals(0, result.size());
    }
}