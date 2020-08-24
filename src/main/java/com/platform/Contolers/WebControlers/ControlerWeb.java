package com.platform.Contolers.WebControlers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The type Controler web.
 */
@Controller
public class ControlerWeb {


    /**
     * Welcom string.
     *
     * @param model the model
     * @return the string
     */
    @GetMapping("/")
    public String welcom (Model model) {

       return "welcom";

    }




}
