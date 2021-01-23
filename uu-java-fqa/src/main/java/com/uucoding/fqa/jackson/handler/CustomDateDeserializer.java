package com.uucoding.fqa.jackson.handler;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.uucoding.fqa.jackson.utils.DateUtils;

import java.io.IOException;
import java.util.Date;


/**
 * 自定义反序列化
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/23  23:39
 */
public class CustomDateDeserializer extends JsonDeserializer<Date> {
    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return DateUtils.str2Data(jsonParser.getText());
    }
}
