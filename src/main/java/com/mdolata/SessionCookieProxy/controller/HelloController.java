package com.mdolata.SessionCookieProxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
    private final String defaultMessage = "default message";

    @GetMapping("/hello/")
    public String hello(@RequestParam(defaultValue = defaultMessage) String message,
                        Model model){
        model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);
        return "hello";
    }
}
