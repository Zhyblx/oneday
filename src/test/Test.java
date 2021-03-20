package test;

import org.util.OneDay;

public class Test {

    public static void main(String[] args) throws Exception {
        OneDay oneDay = new OneDay();
        oneDay.setToDay("2021-3-20");
        System.out.println(oneDay.getWeek() + ">>>>" + oneDay.getIsTodayHoliday());

//        for(String str: ChineseHolidayInterface.HOLIDAY){
//            oneDay.setToDay(str);
//            System.out.println(oneDay.getWeek()+">>>>"+oneDay.getIsTodayHoliday());
//
//        }

//        for(String str: ChineseHolidayInterface.REST){
//            oneDay.setToDay(str);
//            System.out.println(oneDay.getWeek()+">>>>"+oneDay.getIsTodayHoliday());
//
//        }

//        Date date=new Date();
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
//        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("yyyy-M-d");
//        System.out.println(simpleDateFormat.format(date));
//        System.out.println(simpleDateFormat1.format(date));

    }
}
