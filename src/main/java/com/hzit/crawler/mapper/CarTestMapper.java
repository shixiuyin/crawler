package com.hzit.crawler.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface CarTestMapper {

    @Select("SELECT title FROM car_test LIMIT #{page},#{rows}")
    List<String> queryByPage(Map<String, Integer> map);
}
