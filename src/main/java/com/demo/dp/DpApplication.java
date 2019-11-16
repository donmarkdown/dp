package com.demo.dp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author qupengcheng
 * @description
 * @date 20:50 2019/11/15
 */
@SpringBootApplication
public class DpApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DpApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DpApplication.class);
    }
}
