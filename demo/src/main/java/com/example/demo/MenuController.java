package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/menu")
    public String menu(Model model) {
        List<Coffee> coffees = new ArrayList<>();
        // Adaugă opțiuni de cafea la lista coffees

        model.addAttribute("coffees", coffees);
        return "menu";
    }
}