package com.cn.service;

import com.cn.Dao.parkDao;
import com.cn.Util.MoneyUtil;
import com.cn.pojo.park;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class parkServiceImpl implements parkService {
    @Autowired
    private parkDao parkdao;

    @Override
    public int putinStorage(park pr) {
        return parkdao.putinStorage(pr);
    }

    @Override
    public int putoutStorage(park pr) {
        return parkdao.putoutStorage(pr);
    }

    //查询入库时间
    public park selectTime(park pr) throws ParseException {
        pr.setPutin(parkdao.selectTime(pr));
        //日期格式化转化
        SimpleDateFormat b=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.0");
        Date c=b.parse(pr.getPutin());
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        pr.setPutin(format.format(c));
        System.out.println(pr.getPutin());
        pr.setMoney(difference(pr));
        return pr;
    }

    @Override
    public double difference(park pr) throws ParseException {
        MoneyUtil mout=new MoneyUtil();
        double hours=mout.shijiancha(pr);
        double money=0;
        if (hours<0.5&hours>0){
            money=2.5;
        }else if ( hours>0.5){
            double newHours=Math.ceil(hours);
            money=newHours*5;
        }
        return money;

    }

    public parkDao getParkdao() {
        return parkdao;
    }

    public void setParkdao(parkDao parkdao) {
        this.parkdao = parkdao;
    }
}
