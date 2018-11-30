package com.hzit.crawler.service;

public interface ApiServlce {

    /**
     * 使用get请求获取页面数据
     *
     * @param url
     * @return
     */
    public String getHtml(String url);

    /**
     * 使用get请求下载图片,返回图片名
     * @param url
     * @return
     */
    public String getImage(String url);

}
