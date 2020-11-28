package com.cn.Util;

import com.cn.pojo.park;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MoneyUtil {
    public double shijiancha(park park) throws ParseException {
        String a=park.getPutin();
        String b=park.getPutout();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long nd = 1000 * 24 * 60 * 60;
        long nh = 1000 * 60 * 60;
        long nm = 1000 * 60;
        long ns = 1000;
        Date d1=df.parse(a);
        Date d2=df.parse(b);
        System.out.println(d2.getTime());
        long diff=d2.getTime()-d1.getTime();
        // 计算差多少天
        long day = diff / nd;
        // 计算差多少小时
        long hour = diff % nd / nh;
        // 计算差多少分钟
        long min = diff % nd % nh / nm;
        // 计算差多少秒//输出结果
        long sec = diff % nd % nh % nm / ns;
        BigDecimal b1=new BigDecimal(min);
        BigDecimal b2=new BigDecimal("60");
        BigDecimal result1=b1.divide(b2,2,BigDecimal.ROUND_HALF_UP);
        double result2=result1.doubleValue();
        double result=(day*24)+hour+result2;
        return result;
    }
}
