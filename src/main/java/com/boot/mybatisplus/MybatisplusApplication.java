package com.boot.mybatisplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class MybatisplusApplication {

    public static void main(String[] args){
        SpringApplication.run(MybatisplusApplication.class, args);
        System.out.println("MybatisplusApplication-启动完毕!!!");
    }

}
