package com.acorn.acorn_server2342;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HiController {

    @GetMapping("/hi")
    public String hiView(){
        return "hi";
    }
}
