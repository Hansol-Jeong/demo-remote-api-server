package com.fastcampus.special.demoremote.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Martin
 * @since 2021/03/04
 */
@RestController
public class RemoteApiController {
    @GetMapping("/remote")
    public String getRemoteResponse() throws InterruptedException {
        System.out.println(">>> Remote Response!!");

//        Thread.sleep(500);
//
//        return "SUCCESS";
        throw new RuntimeException("ERROR");
    }
}
