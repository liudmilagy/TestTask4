package com.gly.TestTask4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Random;

@Controller
public class TaskController {

    @RequestMapping(value = "/generateinput", method = RequestMethod.GET)
    public String generateInput(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("inputData", randomStringOfValues());
        return "redirect:/input"; // input.jsp
    }

    @RequestMapping(value = "/input", method = RequestMethod.GET)
    public String showInputPage() {
        return "/input";
    }

    public String randomStringOfValues() {
        Random random = new Random();
        StringBuilder inputData = new StringBuilder("");
        int bound = 10 + random.nextInt(40); // [10, 50), чтобы исключить совсем маленький массив чисел

        for(int i = 0; i < bound; i++){
            inputData.append(String.valueOf(random.nextFloat() * 100) + " \n");
        }
        return inputData.toString();
    }
}
