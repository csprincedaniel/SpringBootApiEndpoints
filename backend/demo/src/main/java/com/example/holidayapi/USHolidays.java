package com.example.holidayapi;

import com.example.holidayapi.Holiday;

public class USHolidays {
    public final Holiday[] FederalHolidays = {
        new Holiday("New Year's Day", 1, 1),
        // Martin Luther King Jr. Day — third Monday in January (variable date, so using placeholder)
        new Holiday("Martin Luther King Jr. Day (3rd Monday in January)", 1, 15),
        new Holiday("Groundhog Day (informal)", 2, 2),
        new Holiday("Valentine's Day", 2, 14),
        // Presidents' Day — third Monday in February (variable, placeholder)
        new Holiday("Presidents' Day (3rd Monday in February)", 2, 15),
        new Holiday("St. Patrick's Day (informal)", 3, 17),
        // Memorial Day — last Monday in May (variable, placeholder)
        new Holiday("Memorial Day (last Monday in May)", 5, 31),
        new Holiday("Flag Day (informal)", 6, 14),
        new Holiday("Independence Day", 7, 4),
        // Labor Day — first Monday in September (variable, placeholder)
        new Holiday("Labor Day (1st Monday in September)", 9, 1),
        // Columbus Day — second Monday in October (variable, placeholder)
        new Holiday("Columbus Day (2nd Monday in October)", 10, 8),
        new Holiday("Halloween (informal)", 10, 31),
        new Holiday("Veterans Day", 11, 11),
        // Thanksgiving Day — fourth Thursday in November (variable, placeholder)
        new Holiday("Thanksgiving Day (4th Thursday in November)", 11, 26),
        new Holiday("Christmas Day", 12, 25)};
}
