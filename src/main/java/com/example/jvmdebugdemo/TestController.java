package com.example.jvmdebugdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MikeWang
 * @date 2021/2/25 4:06 下午
 */
@RestController
@RequestMapping("/user")
public class TestController {
    @Autowired
    TestWhile testWhile;
    @RequestMapping("/testWhile")
    public String testController(@RequestParam int size){
        testWhile.testWhile(size);
        return "Hello 程序执行完毕";
    }
}
