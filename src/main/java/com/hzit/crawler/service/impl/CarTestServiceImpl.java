package com.hzit.crawler.service.impl;

import com.hzit.crawler.mapper.CarTestMapper;
import com.hzit.crawler.service.CarTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CarTestServiceImpl implements CarTestService {

    @Autowired
    private CarTestMapper carTestMapper;

    @Override
    public List<String> queryByPage(int page, int rows) {
        Map<String, Integer> map = new HashMap<>();
        map.put("page", (page - 1) * rows);
        map.put("rows", rows);
        List<String> stringList = carTestMapper.queryByPage(map);
        return stringList;
    }
}
