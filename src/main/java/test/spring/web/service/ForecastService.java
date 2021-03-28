package test.spring.web.service;

import org.springframework.stereotype.Service;

import java.util.Random;

//@Service
public class ForecastService {
    public int forecastMarry(int day, int month, int year) {
        Random random = new Random();
        int age = ( random.nextInt(80) ) + 20;
        return age;
    }
}
