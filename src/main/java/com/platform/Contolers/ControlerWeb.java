package com.platform.Contolers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ControlerWeb {



    @GetMapping("/")
    public String welcom (Model model) {

       return "welcom";

    }




}
