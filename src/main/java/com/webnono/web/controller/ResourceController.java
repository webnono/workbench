package com.webnono.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2016/2/25.
 */
@Controller
@RequestMapping(value = "/resource")
public class ResourceController {
//
//    @RequestMapping(value = "/edit", method = RequestMethod.GET )
//    public String resouceView(@RequestParam){
//        return "";
//    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String resourceList(@RequestParam(value = "user-id", required = false) Long userId, Model model){
        return "resourceList";
    }
}
