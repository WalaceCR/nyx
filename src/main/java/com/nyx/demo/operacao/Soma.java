package com.nyx.demo.operacao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Soma {

    @RequestMapping("/soma")
    @ResponseBody
    public Integer soma(){
        return 28 + 28;
    }
}
