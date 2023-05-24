package org.liangfacan53.courses.sf.ssm.springmvc.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IndexService {
    public Map<String, String> getDefault() {
        HashMap<String, String> ret = new HashMap<String, String>();
        ret.put("message","hello, i am liangfacan53...");
        return ret;
    }
}

