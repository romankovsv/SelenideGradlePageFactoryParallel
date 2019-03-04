package config;


import org.testng.Assert;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeUtil {

    public static String getCurrentDateTimeInUTC() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

        return date.format(formatter);

    }

    public static String getCurrentDateTimeInUTCPlusHours(int hours) {
        LocalDateTime date = LocalDateTime.now().plusHours(12);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

        return date.format(formatter);

    }



    public static String getCurrentDateTimeInUTCMinusMinutes(int minutes) {
        LocalDateTime date = LocalDateTime.now().minusMinutes(minutes);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

        return date.format(formatter);

    }

    public static String getDateTimeInString(LocalDateTime time){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

        return time.format(formatter);
    }


    public static Timestamp parseStringToTimestamp(String dateTime) throws Exception {

        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd hh:mm:ss");

        Date parsedTimeStamp = dateFormat.parse(dateTime);

        return new Timestamp(parsedTimeStamp.getTime());

    }




}
