package org.liangfacan53.courses.sf.ssm.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("forward:/hello");
//        return new ModelAndView("redirect:/hello");
    }

}
