package com.ming.sell.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class OrderForm {
    /**
     * 买家姓名，必填
     */
    @NotEmpty(message = "姓名必填")
    private String name;

    /**
     * 买家手机号，必填
     */
    @NotEmpty(message = "手机号必填")
    private String phone;

    /**
     * 卖家地址，必填
     */
    @NotEmpty(message = "地址必填")
    private String address;

    /**
     * 买家 openid，必填
     */
    @NotEmpty(message = "openid必填")
    private String openid;

    /**
     * 购物车
     */
    @NotEmpty(message = "购物车不能为空")
    private String items;
}
