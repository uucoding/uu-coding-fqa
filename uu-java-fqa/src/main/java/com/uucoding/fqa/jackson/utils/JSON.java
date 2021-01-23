package com.uucoding.fqa.jackson.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * json工具类
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/23  21:34
 */
public class JSON {

    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        // 设置全局的TimeZone
        OBJECT_MAPPER.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        // 全局处理时间
        OBJECT_MAPPER.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"){
            @Override
            public Date parse(String source) throws ParseException {
                return DateUtils.str2Data(source);
            }
        });
    }
    /**
     * 字符串转化成对象
     * @param json
     * @param <T>
     * @return
     */
    public static <T> T parser(String json, Class<T> clazz) throws JsonProcessingException {
        return OBJECT_MAPPER.readValue(json, clazz);
    }
    /**
     * 对象转化成字符串
     * @param object
     * @return
     */
    public static String stringify(Object object) throws JsonProcessingException {
        return OBJECT_MAPPER.writeValueAsString(object);
    }
}
