package itheima.ssm.utils;

import javafx.scene.input.DataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {

    public static String date2String(Date date,String patt){
        SimpleDateFormat format = new SimpleDateFormat(patt);
        String str = format.format(date);
        return str;
    }
    //字符串转日期
    public static Date string2Date(String str,String patt) throws ParseException {
        SimpleDateFormat sp = new SimpleDateFormat(patt);
        Date parse = sp.parse(str);
        return parse;
    }
}
