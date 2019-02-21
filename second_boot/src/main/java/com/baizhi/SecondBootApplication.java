package com.baizhi;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

/*
* @SpringBootApplication=@Configuration+@EnableAutoConfiguration+@ComponentScan
* @Configuration声明当前类是一个配置类
* @EnableConfiguration开启自动配置
* @ComponentScan开启组件扫描
* */
@SpringBootApplication
/*
* @MapperScan扫描当前包及子包下的dao接口
* */
@MapperScan("com.baizhi.dao")
public class SecondBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondBootApplication.class, args);
    }

    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
            // 1. 需要定义一个converter转换消息的对象
        FastJsonHttpMessageConverter fasHttpMessageConverter = new
                FastJsonHttpMessageConverter();
            // 2. 添加fastjson的配置信息，比如:是否需要格式化返回的json的数据
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
            // 3. 在converter中添加配置信息
        fasHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        HttpMessageConverter<?> converter = fasHttpMessageConverter;
        return new HttpMessageConverters(converter);
    }

}
