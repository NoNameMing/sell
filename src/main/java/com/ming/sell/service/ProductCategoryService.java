package com.ming.sell.service;

import com.ming.sell.dataobject.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductCategoryService {

    /** 查询一条记录 */
    ProductCategory findOne(Integer categoryId);

    /** 商品类别列表 */
    List<ProductCategory> findAll();

    /** 商品类别编号列表 */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList);

    /** 新增 */
    ProductCategory save(ProductCategory productCategory);
}
