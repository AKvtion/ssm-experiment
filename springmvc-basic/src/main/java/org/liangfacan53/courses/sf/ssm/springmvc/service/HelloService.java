package org.liangfacan53.courses.sf.ssm.springmvc.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
//@Component
public class HelloService {

    public Map<String, String> hello() {
        HashMap<String, String> ret = new HashMap<String, String>();
        ret.put("message","hello, SpringMVC  liangfacan353...");
        return ret;
    }

}
