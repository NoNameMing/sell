package com.ming.sell.service.Impl;

import com.ming.sell.dataobject.ProductInfo;
import com.ming.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl productInfoService;

    @Test
    public void findOne() throws Exception{
        ProductInfo productInfo = productInfoService.findOne("233");
        Assert.assertEquals("233", productInfo.getProductId());
    }

    @Test
    public void findUpAll() throws Exception{
        List<ProductInfo> result = productInfoService.findUpAll();
        Assert.assertNotEquals(0, result.size());
    }

    @Test
    public void findAll() throws Exception{
        PageRequest request = new PageRequest(0, 2);
        Page<ProductInfo> productInfoPage = productInfoService.findAll(request);
        System.out.println(productInfoPage.getTotalElements());
    }

    @Test
    public void save() throws Exception{
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("777");
        productInfo.setProductName("测试ServiceImpl");
        productInfo.setProductPrice(new BigDecimal(2.33));
        productInfo.setProductStock(99);
        productInfo.setProductDescription("测试添加描述");
        productInfo.setProductIcon("testing");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(3);

        ProductInfo result = productInfoService.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void onSale() {
        ProductInfo result = productInfoService.onSale("777");
        Assert.assertNotEquals(ProductStatusEnum.UP, result);
    }

    @Test
    public void offSale() {
        ProductInfo result = productInfoService.offSale("777");
        Assert.assertNotEquals(ProductStatusEnum.DOWN, result);
    }
}