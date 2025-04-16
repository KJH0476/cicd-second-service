package com.example.SecondService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/second")
@RequiredArgsConstructor
public class SecondController {

    private final SecondService secondService;

    @GetMapping("/health")
    @ResponseBody
    public String health() {
        return "OK";
    }

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", secondService.getGreeting());
        return "index";
    }

}
