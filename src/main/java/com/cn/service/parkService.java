package com.cn.service;

import com.cn.pojo.park;

import java.text.ParseException;

public interface parkService {
    //入库登记
    public int putinStorage(park pr);
    //出库登记
    public int putoutStorage(park pr);
    //停车费用
    public double difference(park pr) throws ParseException;
    //查询入库时间
    public park selectTime(park pr) throws ParseException;
}
