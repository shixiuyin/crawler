package com.hzit.crawler.controller;

import com.hzit.crawler.service.TestService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private TestService testService;

    @RequestMapping("mydate")
    public String queryDate() {
        return testService.queryDate();
    }
}
