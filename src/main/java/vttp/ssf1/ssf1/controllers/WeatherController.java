package vttp.ssf1.ssf1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/weather")
public class WeatherController {

    @GetMapping // (produces = "text/html")
    public String getWeather(
            @RequestParam(required = true) String city,
            @RequestParam(name = "units", defaultValue = "kilometers") String units, 
            Model model) {

        model.addAttribute("city", city);
        model.addAttribute("units", units);
        return "weather";
    }

    @GetMapping("{city}") // (produces = "text/html")
    public String getWeather(
            @PathVariable(name = "city", required = true) String city,
            Model model) {

        model.addAttribute("city", city);
        model.addAttribute("units", "kilomters");
        return "weather";
    }
}
