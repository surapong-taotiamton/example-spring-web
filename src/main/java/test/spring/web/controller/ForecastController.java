package test.spring.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import test.spring.web.dto.request.ForecastMarryRequestDto;
import test.spring.web.dto.response.ForecastMarryResponseDto;
import test.spring.web.service.ForecastService;

import java.util.Random;

@RestController
public class ForecastController {

    @Autowired
    private ForecastService forecastService;

    @PostMapping("forecast/marry")
    public ForecastMarryResponseDto forecastMarry(
            @RequestBody ForecastMarryRequestDto request
            ) {
        Random random = new Random();
        int age = ( random.nextInt(80) ) + 20;
        return new ForecastMarryResponseDto()
                .setAge(age);
    }

    @PostMapping("forecast/marry-with-service")
    public ForecastMarryResponseDto forecastMarryWithService(
            @RequestBody ForecastMarryRequestDto request
    ) {
        int age = forecastService.forecastMarry(request.getDay(), request.getMonth(), request.getYear());
        return new ForecastMarryResponseDto().setAge(age);
    }
}
