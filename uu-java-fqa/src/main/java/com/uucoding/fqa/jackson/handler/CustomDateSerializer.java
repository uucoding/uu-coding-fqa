package com.uucoding.fqa.jackson.handler;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.uucoding.fqa.jackson.utils.DateUtils;

import java.io.IOException;
import java.util.Date;

/**
 * 自定义序列化
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/24  00:04
 */
public class CustomDateSerializer extends JsonSerializer<Date> {

    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(DateUtils.date2str(date, "yyyy-MM-dd HH:mm:ss"));
    }
}
