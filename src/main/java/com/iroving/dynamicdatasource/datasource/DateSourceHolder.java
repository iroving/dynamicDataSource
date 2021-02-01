package com.iroving.dynamicdatasource.datasource;

public class DateSourceHolder {
    private static ThreadLocal<String> dataSourceThreadLocal = new ThreadLocal<>();

    public static String getDateSource() {
        return dataSourceThreadLocal.get();
    }

    public static void setDateSource(String dateSourceName) {
        dataSourceThreadLocal.set(dateSourceName);
    }

    public static void clearDateSource() {
        dataSourceThreadLocal.remove();
    }
}
