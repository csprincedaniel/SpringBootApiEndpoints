package com.example.holidayapi;

import java.util.HashMap;
import java.util.Map;

public class Holiday {
    public final String name;
    public final Map<Integer, Integer> date;
    public final int day;
    public final int month;

    public Holiday(String name, int day, int month){
        this.name = name;

        this.day = day;
        this.month = month;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(month, day);

        this.date = map;
    }
}