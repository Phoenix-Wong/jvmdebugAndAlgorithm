package com.example.jvmdebugdemo;

import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author MikeWang
 * @date 2021/2/25 4:02 下午
 */
@Service
public class TestWhile {

    private ConcurrentHashMap map = new ConcurrentHashMap();
    private void whileTrue(){
        while (true){
            for (int i = 0; i < 10000; i++) {
                map.put(Thread.currentThread().getName()+i,i);
            }
        }
    }
    public void testWhile(int size){
        for (int i = 0; i < size; i++) {
            new Thread(()->{
                whileTrue();
            }).start();
        }
    }
}
