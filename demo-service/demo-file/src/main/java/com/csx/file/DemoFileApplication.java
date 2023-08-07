package com.csx.file;

import cn.xuyanwu.spring.file.storage.EnableFileStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFileStorage
public class DemoFileApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoFileApplication.class, args);
    }

}
