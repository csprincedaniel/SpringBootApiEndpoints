package com.example.holidayapi;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.holidayapi.USHolidays;

import jakarta.websocket.server.PathParam;

@RestController
public class RequestController {
    @CrossOrigin(origins="*")
    @GetMapping("/view_all")
    public ResponseEntity<Holiday[]> getAllHolidays() {
        USHolidays holidays = new USHolidays();
        return ResponseEntity.ok(holidays.FederalHolidays);
    } 

    @GetMapping("view/month/{month}")
    public ResponseEntity<Holiday[]> getHolidayByMonth(@PathVariable String month){
        USHolidays holidays = new USHolidays();
        Map<Holiday, Holiday> newMap = new HashMap<>();

        return ResponseEntity.ok(holidays.FederalHolidays); 
    }
}