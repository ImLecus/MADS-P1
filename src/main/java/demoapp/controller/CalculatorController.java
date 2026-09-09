package demoapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import demoapp.service.CalculatorService;

@Controller
public class CalculatorController {

    @Autowired
    CalculatorService service;

    @GetMapping("/calculator")
    public String calculatorForm(CalculatorData data, Model model) {
        model.addAttribute("data", data);
        return "calculator";
    }

    @PostMapping("/calculator")
    public String calculate(@ModelAttribute @Valid CalculatorData data, BindingResult bindingResult, Model model) {
        model.addAttribute("result", service.calcula(data.getFirst(), data.getSecond()));
        return "result";
    }
}
