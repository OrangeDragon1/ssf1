package vttp.ssf1.ssf1.controllers;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/dynamiccontent")
public class DynamicContentController {
    
    @GetMapping(produces = {"text/html"})
    public String dynamicContent(Model model) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();

        // to access in view, object is currTime and currHour
        model.addAttribute("currTime", date.toString());
        model.addAttribute("currHour", cal.get(Calendar.HOUR_OF_DAY));

        // return to page?
        return "dynamiccontent";
    }

}
