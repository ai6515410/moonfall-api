package com.mc.moonfallapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CheckController {

    @RequestMapping("/check.do")
    public String testController() {
        return "200";
    }
}
