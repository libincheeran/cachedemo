package com.libin.cachedemo.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class CacheServiceImpl implements CacheService{

    @Cacheable("mycache")
    public String getValue(String name) {

        System.out.println(" calling with "+name);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name + " hello";
    }
}
