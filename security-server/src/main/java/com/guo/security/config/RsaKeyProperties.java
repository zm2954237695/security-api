package com.guo.security.config;


import com.guo.server.util.RsaUtil;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;
import java.security.PrivateKey;
import java.security.PublicKey;

@Data
@ConfigurationProperties("rsa.key")     //指定配置文件的key
public class RsaKeyProperties {

    private String pubKeyPath;

    private String priKeyPath;

    private PublicKey publicKey;
    private PrivateKey privateKey;

    @PostConstruct
    public void createKey() throws Exception {
        this.publicKey = RsaUtil.getPublicKey(pubKeyPath);
        this.privateKey = RsaUtil.getPrivateKey(priKeyPath);
    }
}

