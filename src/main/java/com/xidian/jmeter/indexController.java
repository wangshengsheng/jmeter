package com.xidian.jmeter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * actuator监控器
 * http://localhost:8080/actuator/beans
 * http://localhost:8080/actuator/mappings  查看spring容器中有多少个接口
 */

@RestController
public class indexController {

    @RequestMapping("/index")
    public String index(){
        //System.out.println("index");
        return "hello word";
    }
}
