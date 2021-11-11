package com.itheima.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Minus
 * @date 2021/11/7 19:43
 */
public class DateConverter implements Converter<String, Date> {
    private String datePattern="yyyy-MM-dd HH:mm:ss";
    @Override
    public Date convert(String s) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(datePattern);
            try {
                return simpleDateFormat.parse(s);
            } catch (ParseException e) {
                throw new IllegalArgumentException("无效的日期格式：" + datePattern);
            }
    }
}
