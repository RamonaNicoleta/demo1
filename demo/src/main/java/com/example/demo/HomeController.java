package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @Value("${greeting.message:Default Greeting}")
    private String greetingMessage;

    @GetMapping("/")
    public String home(Model model, Locale locale, @RequestParam(name = "lang", defaultValue = "en") String lang) {
        // Setează locale în funcție de parametrul lang
        if ("ro".equals(lang)) {
            locale = new Locale("ro");
        } else {
            locale = new Locale("en");
        }

        model.addAttribute("greeting", greetingMessage);
        model.addAttribute("locale", locale);

        // Adaugă opțiuni de cafea în funcție de limbă
        List<Coffee> coffees = getCoffeesForLocale(locale);
        model.addAttribute("coffees", coffees);

        return "home";
    }

    private List<Coffee> getCoffeesForLocale(Locale locale) {
        List<Coffee> coffees = new ArrayList<>();

        if (locale.getLanguage().equals("ro")) {
            coffees.add(new Coffee("Espresso", "Descriere Espresso", "/images/espresso.jpg"));
            coffees.add(new Coffee("Cappuccino", "Descriere Cappuccino", "/images/cappuccino.jpg"));
            coffees.add(new Coffee("Latte", "Descriere Latte", "/images/latte.jpg"));
        } else {
            coffees.add(new Coffee("Espresso", "Espresso Description", "/images/espresso.jpg"));
            coffees.add(new Coffee("Cappuccino", "Cappuccino Description", "/images/cappuccino.jpg"));
            coffees.add(new Coffee("Latte", "Latte Description", "/images/latte.jpg"));
        }

        return coffees;
    }
}
