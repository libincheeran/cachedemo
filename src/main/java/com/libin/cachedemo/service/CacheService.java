package com.libin.cachedemo.service;

import org.springframework.cache.annotation.Cacheable;

public interface CacheService {

    String getValue(String name);
}
