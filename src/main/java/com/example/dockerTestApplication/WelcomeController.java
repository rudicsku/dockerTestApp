package com.example.dockerTestApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {

    @GetMapping(path = "/welcome")
    public String welcome() {
        return "index";
    }

}
