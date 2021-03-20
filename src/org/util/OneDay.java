package org.util;

import org.lang.ChineseHolidayInterface;

import java.text.SimpleDateFormat;

public class OneDay {

    private String toDay = "";

    public void setToDay(String toDay) {
        this.toDay = toDay;

    }

    public String getToDay() {
        return this.toDay;

    }

    private final SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-M-d");

    /**
     * 返回当前星期信息
     *
     * @return toWeek
     * @author 张益斌
     */
    public String getWeek() {
        SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");
        String toWeek = "";
        try {
            toWeek = dateFm.format(simpleDateFormat.parse(this.getToDay()));

        } catch (Exception e) {
            e.printStackTrace();

        }
        return toWeek;

    }

    /**
     * 返回假期调休信息：true表示工作日；false表示假日
     *
     * @return token
     * @author 张益斌
     */

    public Boolean getIsTodayHoliday() {
        boolean token = true;
        for (String holiday : ChineseHolidayInterface.HOLIDAY) {
            if (this.getToDay().equals(holiday)) {
                token = false;
                break;

            } else {
                for (String rest : ChineseHolidayInterface.REST) {
                    if (this.getToDay().equals(rest)) {
                        token = true;
                        break;

                    } else {
                        if (!this.getWeek().equals("星期六") && !this.getWeek().equals("星期日")) {
                            token = true;
                            break;

                        } else {
                            token = false;

                        }
                    }
                }
            }
        }
        return token;

    }
}
