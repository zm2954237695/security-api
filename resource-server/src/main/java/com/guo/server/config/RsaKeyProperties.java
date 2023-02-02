package com.guo.server.config;


import com.guo.server.util.RsaUtil;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;
import java.security.PublicKey;

@Data
@ConfigurationProperties("rsa.key")     //指定配置文件的key
public class RsaKeyProperties {

    private String pubKeyPath;

    private PublicKey publicKey;

    @PostConstruct
    public void createKey() throws Exception {
        this.publicKey = RsaUtil.getPublicKey(pubKeyPath);
    }
}

