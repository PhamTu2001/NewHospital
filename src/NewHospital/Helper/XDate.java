/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewHospital.Helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author balis
 */
public class XDate {
        //lấy giờ hiện tại
    public static Date now() {
        return new Date();   //new Date lấy giờ hiện tại
    }
    //chuuyển String sang Date
    public static final SimpleDateFormat DATE_FORMATER = new SimpleDateFormat("dd/MM/yyyy");
    //truyền vào kiểu String -> Date
    public static Date toDate(String date,String...pattern){
        try {
            if(pattern.length>0)DATE_FORMATER.applyPattern(pattern[0]);
            if(date==null)return XDate.now();
            return DATE_FORMATER.parse(date);
        } catch (ParseException ex) {
            throw new RuntimeException(ex); 
        }
    }
    //chuyen Date -> String
    public static String toString(Date date, String...pattern){
        if(pattern.length>0)DATE_FORMATER.applyPattern(pattern[0]);
        if(date==null)date=XDate.now();
        return DATE_FORMATER.format(date);
    }
    //thêm 1 số ngày vào mốc thời gian
    /*
    @param date kiểu Date
    @param days số ngày thêm, kiểu int
    return date kiểu Date đã thêm số ngày
    */
    public static  Date addDays(Date date, int days){
        //date.setTime(date.getTime()+days*24*60*60*1000);
        //setTime gán cho biến date 1 mốc thời gian được chuyển từ milisecon (long)
        //getTime chuyển mốc thời gian của biến date thành milisecon (long)
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH,days);
        return cal.getTime();
    }
    
    //thêm 1 số ngày vào mốc thời gian hiện tại
    /*
    @param days số ngày thêm, kiểu int
    return date kiểu Date đã thêm số ngày vào date hiện tại
    */
    public static Date add(int days){
        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH,days);
        return cal.getTime();
    }
    
}
