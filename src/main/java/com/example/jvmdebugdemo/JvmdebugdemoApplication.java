package com.example.jvmdebugdemo;

import com.yomahub.tlog.core.enhance.bytes.AspectLogEnhance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JvmdebugdemoApplication {

    static {
        AspectLogEnhance.enhance();}

    public static void main(String[] args) {
        SpringApplication.run(JvmdebugdemoApplication.class, args);
    }

}
