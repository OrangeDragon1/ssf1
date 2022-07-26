package vttp.ssf1.ssf1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/workshop12")
public class WorkShop12Controller {

    @GetMapping(produces = "text/html")
    public String workShopInput() {
        return "workshop12";
    }
}
