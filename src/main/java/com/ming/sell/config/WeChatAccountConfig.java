package com.ming.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WeChatAccountConfig {

    // 公众平台 Id
    private String mpAppId;

    // 公众平台密钥
    private String mpAppSecret;

    // 开发平台Id
    private String openAppId;

    // 开放平台密钥
    private String openAppSecret;

    // 商户号
    private String mchId;

    // 商户密钥
    private String mchKey;

    // 证书路径
    private String keyPath;

    // 微信支付异步通知地址
    private String notifyUrl;
}
