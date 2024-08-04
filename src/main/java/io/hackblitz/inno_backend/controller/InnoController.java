package io.hackblitz.inno_backend.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hackblitz")
@Slf4j
public class InnoController {

    private static final Logger log = LoggerFactory.getLogger(InnoController.class);

    @GetMapping("/test")
    public String test(){
        log.info("Inside controller test");
        return HttpStatus.CREATED.toString();
        //return HttpStatus.OK.toString();
    }
}
