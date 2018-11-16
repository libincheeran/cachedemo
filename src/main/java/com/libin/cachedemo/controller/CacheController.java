package com.libin.cachedemo.controller;

import com.libin.cachedemo.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    private CacheService cacheService;

    public CacheController(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    @GetMapping("/api/greeting/{name}")
    public String getValue(@PathVariable("name") String name){
        //System.out.println(" time of entry "+ LocalTime.now());
        String value = cacheService.getValue(name);
        //System.out.println(" time of entry "+ LocalTime.now());
        return value;
    }
}
