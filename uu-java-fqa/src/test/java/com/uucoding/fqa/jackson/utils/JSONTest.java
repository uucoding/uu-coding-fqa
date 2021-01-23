package com.uucoding.fqa.jackson.utils;

import com.uucoding.fqa.jackson.model.Student;
import org.junit.Test;

import java.util.Date;

public class JSONTest {



    @Test
    public void json() throws Exception{
        Student student = new Student();
        student.setBirthday(new Date());
        student.setGoSchoolTime(new Date());
        student.setGoHomeTime(new Date());
        student.setName("张三");
        String stringify = JSON.stringify(student);
        System.out.println(stringify);
        String jsonStr = "{\"name\":\"张三\",\"birthday\":\"2021-01-24\",\"goSchoolTime\":\"2021-01-24 00:11:59\",\"goHomeTime\":\"2021-01-24 00:11\"}\n";

        Student parser = JSON.parser(jsonStr, Student.class);
        System.out.println(parser);
    }

}