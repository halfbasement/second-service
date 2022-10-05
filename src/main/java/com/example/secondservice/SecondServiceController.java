package com.example.secondservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-service")
@Slf4j
public class SecondServiceController {

    @GetMapping("/welcome")
    public String welcome(){
        return "세컨도 서비스 입니다.";
    }


    @GetMapping("/message")
    public String message(@RequestHeader("second-request") String header){

        log.info(header);

        return "헬로월드 두번째 서비스";
    }

    @GetMapping("/check")
    public String check(){
        return "Hi , check Second - Serivce";
    }
}
