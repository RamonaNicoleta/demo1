package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String getIndexPage() {
        return "index"; // This corresponds to the name of your HTML file without the extension
    }
}
