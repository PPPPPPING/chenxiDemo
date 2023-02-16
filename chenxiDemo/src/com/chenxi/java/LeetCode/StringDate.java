package com.chenxi.java.LeetCode;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author cxi
 * @Date 2022/7/11 22:28
 */
public class StringDate {

    public static void main(String[] args) {
        getNextDay();
        System.out.println("当前时间年月日时分秒：" + formatDateToString(new Date()));
        System.out.println("当前时间年月日：" + formatDateYmdToString(new Date()));
    }

    /**
     * 当前时间加14天后返回的String类型格式为yyyyMMddHHmmss
     * @return
     */
    public static String getNextDay() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //+14今天的时间加一天
        calendar.add(Calendar.DAY_OF_MONTH, +14);
        date = calendar.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(date);
        System.out.println("dateString:" + dateString);
        String overTime = getTimeFront(dateString);
        System.out.println("overTime:" + overTime);
        return overTime;
    }

    /**
     * 字符串yyyyMMddHHmmss格式 转化成 字符串 yyyy-MM-dd HH:mm:ss
     *
     * @param uploadTimeStr
     * @return
     */
    public static String getDateTime(String uploadTimeStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date uploadTime = null;
        try {
            uploadTime = sdf.parse(uploadTimeStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String upload = sdf.format(uploadTime);
        return upload;
    }

    /**
     * 字符串 yyyy-MM-dd 格式 转化成 字符串yyyyMMddHHmmss
     *
     * @param time
     * @return
     */
    public static String getTime(String time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String timeStr = null;
        try {
            Date timeDate = sdf.parse(time);
            sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            timeStr = sdf.format(timeDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return timeStr;
    }

    /**
     * 字符串 yyyy-MM-dd HH:mm:ss格式 转化成 字符串yyyyMMddHHmmss
     *
     * @param time
     * @return
     */
    public static String getTimeFront(String time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStr = null;
        try {
            Date timeDate = sdf.parse(time);
            sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            timeStr = sdf.format(timeDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return timeStr;
    }

    /**
     * 字符串 yyyy-MM-dd HH:mm:ss格式 转化成 字符串yyyyMMddHHmmss
     *
     * @param
     * @return
     */
    @Test
    public void stringTime(){
        String strTime = "2022-10-10";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //设置一个格式，将String转化为Date!!!
            Date timeDate = sdf.parse(strTime);
            System.out.println(timeDate);
            //再设置一个格式，将Date类型格式转换，然后新建一个String接收!!!
            sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timeStr = sdf.format(timeDate);
            System.out.println(timeStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * Date类型转化成yyyyMMddHHmmss
     * @param timeDate
     * @return
     */
    public static String formatDateToString(Date timeDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(timeDate);
    }

    /**
     * Date类型转成yyyyMMdd
     * @param timeDate
     * @return
     */
    public static String formatDateYmdToString(Date timeDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(timeDate);
    }

}
