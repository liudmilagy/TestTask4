package com.gly.TestTask4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

    @RequestMapping(value = "/sort", method = RequestMethod.POST)
    public String sort(Model model, @RequestParam(value = "input") String inputData) {
//        System.out.println("Зашли в сорт");
        Float[] array = parseStringToArray(inputData, "\r\n");
        sort(array);
        String outputData = arrayToString(array);
        model.addAttribute("outputData", outputData);
        return "/output";
    }

    ////////////////////////////////////////////////////////////////////////////

    public String randomStringOfValues() {
        Random random = new Random();
        int bound = 10 + random.nextInt(40); // [10, 50), чтобы исключить совсем маленький массив чисел
        StringBuilder inputData = new StringBuilder(String.valueOf(random.nextFloat() * 100));
        for(int i = 1; i < bound; i++){
            inputData.append("\n" + String.valueOf(random.nextFloat() * 100));
        }
        return inputData.toString();
    }

    public Float[] parseStringToArray(String data, String regex) {
        String[] arrString = data.split(regex);
        Float[] array = new Float[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
                array[i] = Float.parseFloat(arrString[i]);
        }
        return array;
    }

    public void sort(Float[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                if (array[j-1] > array[j]) {
                    swap(array, j-1, j);
                }
            }
        }
    }

    public void swap(Float[] array, int i, int j) {
        Float tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public String arrayToString(Object[] array) {
        StringBuilder str = new StringBuilder(array[0].toString());
        for (int i = 1; i <array.length; i++) {
            str.append("\n" + array[i].toString());
        }
        return str.toString();
    }
}
