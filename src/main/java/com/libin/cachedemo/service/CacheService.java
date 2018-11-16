package com.libin.cachedemo.service;

import org.springframework.cache.annotation.Cacheable;

public interface CacheService {

    @Cacheable("mycache")
    String getValue(String name);
}
