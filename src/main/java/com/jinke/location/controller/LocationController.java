package com.jinke.location.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/location")
public class LocationController {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getLocation() {
        return "index";
    }
}
