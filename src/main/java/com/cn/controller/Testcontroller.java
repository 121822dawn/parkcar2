package com.cn.controller;

import com.cn.pojo.park;
import com.cn.service.parkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class Testcontroller {
    @Autowired
    @Qualifier("parkServiceImpl")
    private parkService parkservice;
    @RequestMapping("/toputin")
    public String toPutin(){
        return "parking";
    }
    @RequestMapping("/PutIn")
    public String putinStorage(park pr, Model model) throws ParseException {
        System.out.println(pr.getLicense_number());
        System.out.println(pr.getPutin());
        int count=parkservice.putinStorage(pr);
        if (count>0){
            model.addAttribute("pr",pr);
            return "carList";
        }else {
            return "parking";
        }
        //return "parking";
    }
    @RequestMapping("/toputout")
    public String toPutout(){
        return "charge";
    }
    @RequestMapping("/Putout")
    public String putoutStorage(park pa,Model model) throws ParseException {
        System.out.println(pa.getPutout());
        //日期格式化转化
        SimpleDateFormat b=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date c=b.parse(pa.getPutout());
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        pa.setPutout(format.format(c));
        System.out.println(pa.getPutout());
        //得到停车费
        pa=parkservice.selectTime(pa);
        System.out.println(pa.getPutin());
        int count=parkservice.putoutStorage(pa);
        model.addAttribute("pa",pa);
        if (count>0){
            return "chaList";
        }else {
            return "charge";
        }
//        return "charge";
    }
}
