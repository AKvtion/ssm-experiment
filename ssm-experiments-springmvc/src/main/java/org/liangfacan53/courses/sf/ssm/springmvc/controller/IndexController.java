package org.liangfacan53.courses.sf.ssm.springmvc.controller;

import org.liangfacan53.courses.sf.ssm.springmvc.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @Autowired
    private IndexService service;

    //    http://localhost:8080/ssm_experiments_springmvc_war/hello
    @RequestMapping("/hello")
    public ModelAndView index() {
        return new ModelAndView("hello", service.getDefault());
    }
}
