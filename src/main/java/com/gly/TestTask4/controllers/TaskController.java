package com.gly.TestTask4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class TaskController {

    @RequestMapping(value = "/generateinput", method = RequestMethod.GET)
    public @ResponseBody String  generateInput() {
        Random random = new Random();
        StringBuilder inputData = new StringBuilder("");
        int bound = 10 + random.nextInt(40); // [10, 50), чтобы исключить совсем маленький массив чисел

        for(int i = 0; i < bound; i++){
            inputData.append(String.valueOf(random.nextFloat() * 100) + " \n");
        }
        return inputData.toString();
    }
}
