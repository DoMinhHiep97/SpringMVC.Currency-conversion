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
    public String conversion(@RequestParam String rate, String USD, Model model){

        double vnd=Double.parseDouble(USD)*Double.parseDouble(rate);
        model.addAttribute("vnd",vnd);
        return "index";
    }
}
