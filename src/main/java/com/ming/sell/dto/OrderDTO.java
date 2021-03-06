package com.ming.sell.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ming.sell.dataobject.OrderDetail;
import com.ming.sell.enums.OrderStatusEnum;
import com.ming.sell.enums.PayStatusEnum;
import com.ming.sell.utils.EnumUtil;
import com.ming.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    /** 订单Id. **/
    private String orderId;

    /** 买家名字. **/
    private String buyerName;

    /** 买家手机号. **/
    private String buyerPhone;

    /** 买家地址. **/
    private String buyerAddress;

    /** 买家微信openId. **/
    private String buyerOpenid;

    /** 订单总金额. **/
    private BigDecimal orderAmount;

    /** 订单状态，默认为新下单，0. **/
    private Integer orderStatus;

    /** 支付状态，默认为未支付，0. **/
    private Integer payStatus;

    /** 订单创建时间. **/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /** 更新时间. **/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum() {
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum() {
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }

}
