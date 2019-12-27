package com.ming.sell.form;

import lombok.Data;

@Data
public class ProductCategoryForm {
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
