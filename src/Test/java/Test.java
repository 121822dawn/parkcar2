import com.cn.Util.MoneyUtil;
import com.cn.pojo.park;
import com.cn.service.parkService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        parkService prs=(parkService)ac.getBean("parkServiceImpl");
        park pa=new park();
        pa.setLicense_number("晋DT245");
        pa.setPutout("2012-12-01 06:45:01");
        pa=prs.selectTime(pa);
        System.out.println(pa.getPutin()+pa.getMoney());
        System.out.println(prs.putoutStorage(pa));

//        pa.setPutin("2018-11-20");
//        //System.out.println(prs.putinStorage(pa));
//        pa.setPutout("2018-11-20");
//        pa.setMoney(5);
//        System.out.println(prs.putoutStorage(pa));
//        park pa=new park();
//        pa.setPutin("2018-09-11 12:22:11");
//        pa.setPutout("2018-09-12 14:33:12");
//        String a="2020-03-09T15:14:50";
//        SimpleDateFormat b=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
//        Date c=b.parse(a);
//        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String time=format.format(c);
//        System.out.println(time);

    }
}
