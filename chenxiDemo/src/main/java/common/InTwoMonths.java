package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author ping
 * @Date 2023/1/4 16:51
 */
public class InTwoMonths {
    public static void main(String[] args) {
        months();
    }
    public static void months (){
        String start = "2022-07-01 06:11:56";
        String end = "2022-09-01 06:11:55";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            //设置一个格式，将String转化为Date!!!
            Date startT = formatter.parse(start);
            Date endT = formatter.parse(end);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startT);
            calendar.add(Calendar.MONTH, 2);//增加一个月
            String Matter = formatter.format(calendar.getTime());
            Date dateMatter = formatter.parse(Matter);

            calendar = Calendar.getInstance();
            calendar.setTime(startT);
            calendar.add(Calendar.MONTH, -2);//增加一个月
            String Matter1 = formatter.format(calendar.getTime());
            Date dateMatter1 = formatter.parse(Matter1);

            System.out.println("两个时间["+start+","+end+"]是否在两个月内?         "+InDate(endT, dateMatter, dateMatter1));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static boolean InDate(Date nowTime, Date startTime, Date endTime) {
        return nowTime.after(endTime) && nowTime.before(startTime);
    }
}
