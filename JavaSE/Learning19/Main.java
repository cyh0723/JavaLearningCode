package JavaSE.Learning19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 陈宇浩
 * @version 1.0
 * Create by 2024/4/15 19:44
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        String begin_time="2023年11月11日 0:0:0";
        String end_time="2023年11月11日 0:10:0";
        SimpleDateFormat time=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date begin_date = time.parse(begin_time);
        Date end_date = time.parse(end_time);
        String xiaojia="2023年11月11日 0:01:0";
        Date xiaojiaDate = time.parse(xiaojia);
        String xiaopi="2023年11月11日 0:11:0";
        Date xiaopiDate = time.parse(xiaopi);
        if (xiaopiDate.getTime()>=begin_date.getTime() && xiaopiDate.getTime()<=end_date.getTime()){
            System.out.println("xiaopi参加");
        }else {
            System.out.println("xiaopi没参加");
        }
        if (xiaojiaDate.getTime()>=begin_date.getTime() && xiaojiaDate.getTime()<=end_date.getTime()){
            System.out.println("xiaojia参加");
        }else {
            System.out.println("xiaojia没参加");
        }
    }
}
