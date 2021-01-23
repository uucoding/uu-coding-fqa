package com.uucoding.fqa;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 所有测试类继承自此
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/23  21:54
 */
@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
