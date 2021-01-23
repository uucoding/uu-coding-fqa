package com.uucoding.fqa.jackson.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.uucoding.fqa.jackson.handler.CustomDateDeserializer;
import com.uucoding.fqa.jackson.handler.CustomDateSerializer;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 测试类
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/23  21:31
 */
@Getter@Setter@ToString
public class Student {

    private String name;

    private Date birthday;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date goSchoolTime;

    /**
     * 自定义序列化
     */
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date goHomeTime;
}
