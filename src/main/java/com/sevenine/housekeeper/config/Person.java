package com.sevenine.housekeeper.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 人员配置
 * created by xu-jp on 2021/6/1
 **/
@Component // 或者@Configuration
@ConfigurationProperties(prefix = "person")
public class Person {
    private List<String> list;


    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}