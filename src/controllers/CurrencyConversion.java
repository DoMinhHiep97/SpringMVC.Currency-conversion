package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConversion {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/conversion")
    public String conversion(@RequestParam String USD, Model model){

        double vnd=Double.parseDouble(USD)*22000;
        model.addAttribute("vnd",vnd);
        return "index";
    }
}
