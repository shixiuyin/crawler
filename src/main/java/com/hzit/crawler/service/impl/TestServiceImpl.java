package com.hzit.crawler.service.impl;

import com.hzit.crawler.mapper.TestMapper;
import com.hzit.crawler.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {


    @Autowired
    private TestMapper testMapper;

    @Override
    public String queryDate() {
        return testMapper.queryDate();
    }
}
