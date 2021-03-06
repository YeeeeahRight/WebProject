package com.epam.web.date;

import java.util.Date;

public class DateFormatter {

    public static String format(Date date, DateFormatType dateFormatType) {
        switch (dateFormatType) {
            case MYSQL:
                return DateFormatters.MYSQL_FORMATTER.format(date);
            case HTML:
                return DateFormatters.HTML_FORMATTER.format(date);
            case LOCALE_RU:
                return DateFormatters.RU_LOCALE_FORMATTER.format(date);
            case LOCALE_ENG:
                return DateFormatters.ENG_LOCALE_FORMATTER.format(date);
            default:
                throw new IllegalArgumentException("Unknown date format type.");
        }
    }
}
