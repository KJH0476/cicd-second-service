package com.example.SecondService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SecondService {

    public String getGreeting() {
        return "Hello from SecondService!";
    }
}
