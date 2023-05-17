package org.liangfacan53.courses.sf.ssm.springmvc.controller;

import org.liangfacan53.courses.sf.ssm.springmvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
//@Component
public class HelloController {

    @Autowired
    private HelloService helloService;

    //访问链接：http://localhost:8080/springmvc_basic_war/hello

    @RequestMapping("/hello")
    public ModelAndView hello(){
        Map<String,String> model = this.helloService.hello();
        return new ModelAndView("hello", model);
    }

}
