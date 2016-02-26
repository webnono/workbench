package com.webnono.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2015/12/18.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String indexView(){
        return "redirect:/goods/list";
    }
}
