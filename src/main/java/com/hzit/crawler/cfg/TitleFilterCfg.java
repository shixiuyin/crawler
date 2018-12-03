package com.hzit.crawler.cfg;

import com.hzit.crawler.service.CarTestService;
import com.hzit.crawler.util.BloomFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TitleFilterCfg {

    @Autowired
    private CarTestService carTestService;

    @Bean
    public BloomFilter bloomFilter() {
        // 创建车辆标题过滤器
        BloomFilter bloomFilter = new BloomFilter();

        // 从数据库查询车辆标题，分页查询
        List<String> list = this.carTestService.queryByPage(1, 500);

        // 遍历查询结果
        for (String str : list) {
            // 把查询到的数据放到过滤器中
            bloomFilter.add(str);
        }

        // 返回创建好的过滤器
        return bloomFilter;
    }


}
