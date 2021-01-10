package com.nyx.demo.surpresa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SomaDeStrings {

    @RequestMapping("/surpresa")
    @ResponseBody
    public String retornoSomaString(){
        return "Walace " + "ama" + " Luana S2";
    }
}
