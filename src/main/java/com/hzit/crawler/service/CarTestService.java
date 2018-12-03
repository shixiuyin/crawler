package com.hzit.crawler.service;

import java.util.List;

public interface CarTestService {
    /**
     * 分页查询标题数据
     * @param page
     * @param rows
     * @return
     */
    List<String> queryByPage(int page, int rows);
}
