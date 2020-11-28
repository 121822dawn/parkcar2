package com.cn.Dao;

import com.cn.pojo.park;
import org.springframework.stereotype.Repository;

@Repository
public interface parkDao {
    //入库登记
    public int putinStorage(park pr);
    //出库登记
    public int putoutStorage(park pr);
    //查询入库时间
    public String selectTime(park pr);

}
