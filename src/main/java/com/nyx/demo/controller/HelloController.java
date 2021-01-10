package com.nyx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/entrada")
    @ResponseBody
    public String chegueiNoPistao(){
        return "CHEGUEEEEIIII NO PISTÃÃÃÃÃÃOO" + "\n"
                + "Para outras rotas digitar na url em outras abas:" + "\n"
                + "/surpresa" + "\n"
                + "/soma" + "\n";
    }

}
