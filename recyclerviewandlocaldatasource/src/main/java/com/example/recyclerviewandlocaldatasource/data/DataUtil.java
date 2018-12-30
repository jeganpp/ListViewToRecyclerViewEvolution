package com.example.recyclerviewandlocaldatasource.data;

public class DataUtil {
    static String[] names = new String[] {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
    static String[] descriptions = new String[] {"Dharshini birthday. Very cold", "Nive birthday", "Sudhan birthday", "Achu birthday. Spring", "5th month", "end of school", "Jegan birth day",
                                          "Priya birthday", "End of summer", "Begin fall", "Sanju birthday", "Last month of year"};
    static int[] ids = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public static String[] getNames() {
        return names;
    }

    public static String[] getDescriptions() {
        return descriptions;
    }

    public static int[] getIds() {
        return ids;
    }

    public static Month[] getMonths() {
        Month[] months = new Month[names.length];
        for(int i = 0; i < months.length; i ++) {
            months[i] = new Month(names[i], descriptions[i], ids[i]);
        }
        return months;
    }
}
