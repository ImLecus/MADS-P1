package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String calcula(Integer first, Integer second) {
        return String.valueOf(first + second);
    }
}
