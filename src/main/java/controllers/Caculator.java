package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Caculator {
    final String ADD = "Addtion(+)";
    final String SUB = "Subtraction(-)";
    final  String MUL = "Multiplication(x)";
    final  String DIV = "Division(/)";
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @RequestMapping("/home")
    public String result(@RequestParam String caculator, @RequestParam float number1, @RequestParam float number2, Model model){
        float result=0 ;
        if (caculator.equals(ADD)){
            result = number1 + number2;
        }
        if ((caculator.equals(SUB))){
            result = number1 - number2;
        }
        if (caculator.equals(MUL)) {
            result = number1 * number2;
        }
        if ((caculator.equals(DIV))){
            result  = number1/number2;
        }
        model.addAttribute("result",result);
        return "index";
    }
}
