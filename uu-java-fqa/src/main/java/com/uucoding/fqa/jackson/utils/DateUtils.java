package com.uucoding.fqa.jackson.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 时间格式类
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/23  23:39
 */
public class DateUtils {
    private static List<String> fmtList = new ArrayList<String>() {{
        add("yyyy-MM-dd HH:mm:ss");
        add("yyyy-MM-dd HH:mm");
        add("yyyy-MM-dd HH");
        add("yyyy-MM-dd");
    }};

    /***
     * 转换字符串为日期date
     * <br/>
     * 自动匹配转化，支持fmtList中的几种格式
     * @param dateStr
     * @param fmtIndex
     * @return
     */
    public static Date str2Data(String dateStr, int... fmtIndex) {
        int index = 0;
        if (fmtIndex != null && fmtIndex.length > 0) {
            index = fmtIndex[0];
        }
        if (index > fmtList.size() - 1) {
            return null;
        }
        SimpleDateFormat format = new SimpleDateFormat(fmtList.get(index));
        try {
            Date date = format.parse(dateStr);
            return date;
        } catch (ParseException e1) {
            return str2Data(dateStr, ++index);
        }
    }

    /***
     * date格式化字符串
     * @param date
     * @param fmt
     * @return
     */
    public static String date2str(Date date, String fmt) {
        SimpleDateFormat format = new SimpleDateFormat(fmt);
        return format.format(date);
    }
}
