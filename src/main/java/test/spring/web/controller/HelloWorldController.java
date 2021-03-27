package test.spring.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import test.spring.web.dto.request.EchoRequestDto;
import test.spring.web.dto.response.EchoResponseDto;

@RestController
public class HelloWorldController {

    @GetMapping("/test/helloworld")
    public String helloWorld() {
        return "Hello world";
    }

    @PostMapping("/test/echo")
    public EchoResponseDto echo(
            @RequestBody EchoRequestDto request
            ) {
        EchoResponseDto echoResponseDto = new EchoResponseDto();
        echoResponseDto.setEchoMessage("echo : " + request.getMessage());
        return echoResponseDto;
    }

}
