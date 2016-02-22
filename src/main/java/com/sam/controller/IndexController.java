package com.sam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by leo on 22/02/2016.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/",method = RequestMethod.GET )
    public String index(){
        return "index";
    }
}
