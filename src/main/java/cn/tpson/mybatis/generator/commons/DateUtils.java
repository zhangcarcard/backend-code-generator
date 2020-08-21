package cn.tpson.mybatis.generator.commons;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 * @author zk
 */
public class DateUtils {
    public static final int DAY_SECONDS = 24 * 3600;
    public static final String FORMAT_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_DATE_MIN = "yyyy-MM-dd HH:mm";
    public static final String FORMAT_DATE = "yyyy-MM-dd";
    public static final String FORMAT_TIME = "HH:mm:ss";
    public static final String FORMAT_DATE_TIME_ZONE = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

    private DateUtils() {
        throw new AssertionError("No DateUtils instances for you!");
    }

    public static Date now() {
        return new Date();
    }

    /**
     * 格式化日期时间.
     *
     * @return
     */
    public static String getFormatDateTime() {
        return getFormatDateTime(now(), FORMAT_DATE_TIME);
    }

    public static String getFormatDateTime(Date date) {
        return getFormatDateTime(date, FORMAT_DATE_TIME);
    }

    public static String getFormatDateTime(Date date, String pattern) {
        if (date == null)
            return null;

        SimpleDateFormat df = new SimpleDateFormat(pattern);
        return df.format(date);
    }

    /**
     * 格式化日期.
     *
     * @return
     */
    public static String getFormatDate() {
        return getFormatDateTime(now(), FORMAT_DATE);
    }

    public static String getFormatDate(Date date) {
        return getFormatDateTime(date, FORMAT_DATE);
    }

    /**
     * 格式化时间.
     *
     * @return
     */
    public static String getFormatTime() {
        return getFormatDateTime(now(), FORMAT_TIME);
    }

    public static String getFormatTime(Date date) {
        return getFormatDateTime(date, FORMAT_TIME);
    }

    public static Date parse(String date, String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        try {
            return df.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 当天的开始时间.
     * 2018-11-01 00:00:00.000
     *
     * @return
     */
    public static Date getBeginOfToday() {
        return getBeginOfToday(now());
    }

    public static Date getBeginOfToday(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);

        return c.getTime();
    }

    /**
     * 当天的截止时间.
     * 2018-11-01 23:59:59.999
     *
     * @return
     */
    public static Date getEndOfToday() {
        return getEndOfToday(now());
    }

    public static Date getEndOfToday(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) + 1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);

        return c.getTime();
    }

    /**
     * 查询区间截止时间.
     *
     * @param d
     * @return
     */
    @Deprecated
    public static Date getQueryEndOfToday(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) + 1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);

        return c.getTime();
    }

    /**
     * 当前小时的开始时间.
     * 2018-11-01 01:00:00.000
     *
     * @return
     */
    public static Date getBeginOfHour() {
        return getBeginOfHour(now());
    }

    public static Date getBeginOfHour(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);

        return c.getTime();
    }

    /**
     * 当天的截止时间.
     * 2018-11-01 23:59:59.999
     *
     * @return
     */
    public static Date getEndOfHour() {
        return getEndOfHour(now());
    }

    public static Date getEndOfHour(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY) + 1);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);

        return c.getTime();
    }

    @Deprecated
    public static Date getQueryEndOfHour(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY) + 1);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);

        return c.getTime();
    }

    /**
     * 本周开始日期.
     * 本周周一的日期.
     *
     * @return
     */
    public static Date getBeginOfWeek() {
        return getBeginOfWeek(now());
    }

    public static Date getBeginOfWeek(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    /**
     * 本周截止日期.
     * 本周周日的日期.
     *
     * @return
     */
    public static Date getEndOfWeek() {
        return getEndOfWeek(now());
    }

    public static Date getEndOfWeek(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        c.add(Calendar.DATE, 7);// 定位到下周一
        return c.getTime();
    }

    /**
     * 本月开始日期.
     *
     * @return
     */
    public static Date getBeginOfMonth() {
        return getBeginOfMonth(now());
    }

    public static Date getBeginOfMonth(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.set(Calendar.DAY_OF_MONTH, 1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    /**
     * 本月截止日期.
     *
     * @return
     */
    public static Date getEndOfMonth() {
        return getEndOfMonth(now());
    }

    public static Date getEndOfMonth(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.set(Calendar.MILLISECOND, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.DAY_OF_MONTH, 28);

        int currentMonth = c.get(Calendar.MONTH);
        int point;
        do {
            c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) + 1);
            point = c.get(Calendar.MONTH);
        } while (currentMonth == point);
        return c.getTime();
    }


    /**
     * 本年第一天
     *
     * @return
     */
    public static Date getBeginOfYear() {
        return getBeginOfYear(now());
    }

    public static Date getBeginOfYear(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.set(Calendar.DAY_OF_YEAR, 1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    /**
     * 本年最后一天
     *
     * @return
     */
    public static Date getEndOfYear() {
        return getEndOfYear(now());
    }

    public static Date getEndOfYear(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.YEAR, 1);
        c.set(Calendar.MONTH, Calendar.JANUARY);
        c.set(Calendar.DAY_OF_MONTH, 1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    public static int minusYears(Date begin, Date end) {
        Calendar b = Calendar.getInstance();
        b.setTime(begin);

        Calendar e = Calendar.getInstance();
        e.setTime(end);

        int by = b.get(Calendar.YEAR);
        int ey = e.get(Calendar.YEAR);

        return ey - by;
    }

    /**
     * 计算间隔天数.
     *
     * @param begin 开始日期
     * @param end   截止日期
     * @return
     */
    public static int minusDays(Date begin, Date end) {
        Calendar b = Calendar.getInstance();
        b.setTime(begin);

        Calendar e = Calendar.getInstance();
        e.setTime(end);
        int bd = b.get(Calendar.DAY_OF_YEAR);
        int ed = e.get(Calendar.DAY_OF_YEAR);

        int by = b.get(Calendar.YEAR);
        int ey = e.get(Calendar.YEAR);

        return minusDays(by, ey, bd, ed);
    }

    /**
     * 计算间隔天数.
     *
     * @param by 开始年份
     * @param ey 截止年份
     * @param bd 开始日期
     * @param ed 截止日期
     * @return
     */
    public static int minusDays(int by, int ey, int bd, int ed) {
        if (by != ey) {
            int timeDistance = 0;
            for (int i = by; i < ey; i++) {
                if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                    timeDistance += 366;
                } else {
                    timeDistance += 365;
                }
            }

            return timeDistance + (ed - bd);
        } else {
            return ed - bd;
        }
    }

    /**
     * 得到几天前的时间.
     *
     * @param date
     * @param days
     * @return
     */
    public static Date getDateBefore(Date date, int days) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.DATE, c.get(Calendar.DATE) - days);
        return c.getTime();
    }

    /**
     * 得到几天后的时间
     *
     * @param date
     * @param days
     * @return
     */
    public static Date getDateAfter(Date date, int days) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.DATE, c.get(Calendar.DATE) + days);
        return c.getTime();
    }

    /**
     * 获取几秒后的时间
     *
     * @param date
     * @param secs
     * @return
     */
    public static Date getSecondBefore(Date date, int secs) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.SECOND, c.get(Calendar.SECOND) - secs);
        return c.getTime();
    }

    /**
     * 获取几秒前的时间
     *
     * @param date
     * @param secs
     * @return
     */
    public static Date getSecondAfter(Date date, int secs) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.SECOND, c.get(Calendar.SECOND) + secs);
        return c.getTime();
    }

    /**
     * 本月第几周.
     *
     * @return
     */
    public static int getWeekOfMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DAY_OF_WEEK_IN_MONTH);
    }

    /**
     * 今天是星期几.
     *
     * @return
     */
    public static int getDayOfWeek(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DAY_OF_WEEK) - 1;
    }

    /**
     * 获取年份.
     *
     * @param date
     * @return
     */
    public static int getYear(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.YEAR);
    }

    /**
     * 获取月份.
     *
     * @param date
     * @return
     */
    public static int getMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.MONTH) + 1;
    }

    /**
     * 获取日期.
     *
     * @param date
     * @return
     */
    public static int getDay(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 获取季度.
     *
     * @param date
     * @return
     */
    public static int getSeason(Date date) {
        int season = 0;

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int month = c.get(Calendar.MONTH);
        switch (month) {
            case Calendar.JANUARY:
            case Calendar.FEBRUARY:
            case Calendar.MARCH:
                season = 1;
                break;
            case Calendar.APRIL:
            case Calendar.MAY:
            case Calendar.JUNE:
                season = 2;
                break;
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.SEPTEMBER:
                season = 3;
                break;
            case Calendar.OCTOBER:
            case Calendar.NOVEMBER:
            case Calendar.DECEMBER:
                season = 4;
                break;
            default:
                break;
        }
        return season;
    }


    public static Date toDate(Instant instant) {
        BigInteger milis = BigInteger.valueOf(instant.getEpochSecond()).multiply(BigInteger.valueOf(1000));
        milis = milis.add(BigInteger.valueOf(instant.getNano()).divide(BigInteger.valueOf(1_000_000)));
        return new Date(milis.longValue());
    }


    public static Date removeMill(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    /**
     * 计算2个时间间隔的小时数
     *
     * @param startTime
     * @param endTime
     * @param timePattern
     * @return
     */
    public static int intervalHours(String startTime, String endTime, String timePattern) {
        Date start = parse(startTime, timePattern);
        Date end = parse(endTime, timePattern);

        Calendar starCal = Calendar.getInstance();
        starCal.setTime(start);
        Calendar endCal = Calendar.getInstance();
        endCal.setTime(end);
        int sm = starCal.get(Calendar.MINUTE);
        int sh = starCal.get(Calendar.HOUR_OF_DAY);
        int em = endCal.get(Calendar.MINUTE);
        int eh = endCal.get(Calendar.HOUR_OF_DAY);

        int h = (((eh * 60) + em) - ((sh * 60) + sm)) / 60;
        return h;
    }
}
