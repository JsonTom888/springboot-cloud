package com.example.springbootcloud;

import com.example.FirstClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableAutoImport // 自定义装配注解
public class SpringbootCloudApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootCloudApplication.class, args);
        FirstClass bean = context.getBean(FirstClass.class);
        System.out.println(bean.myName());


    }

}
