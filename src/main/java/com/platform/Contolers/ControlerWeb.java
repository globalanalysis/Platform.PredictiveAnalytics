package com.platform.Contolers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ControlerWeb {



    @GetMapping("/")
    public String welcom (Model model) {

        String helloBro = "Hello World";
        model.addAttribute("helloBro", helloBro);


        return "welcom";

    }




}
