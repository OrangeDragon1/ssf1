package vttp.ssf1.ssf1.controllers;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/processnumber")
public class WorkShop12ResultController {

    @PostMapping(produces = "text/html")
    public String generateNum(
            @RequestParam(name = "inputNumber", defaultValue = "1") Integer number,
            Model model) {
        
        List<Integer> numList = new ArrayList<>();
        int loop = number;
        SecureRandom rand = new SecureRandom();

        while (loop > 0) {
            int randomNum = rand.nextInt(20) + 1;
            if (!numList.contains(randomNum)) {
                numList.add(randomNum);
                loop--;
            }
        }

        model.addAttribute("numbers", numList);
        return "workshop12result";
    }

}
