package com.al.sampleprojects.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

@GetMapping(path="/hello")
@ResponseBody
    public String callHello(){
        System.out.println("Hello from demo1");
         return "New Hello from demo1";
    }

}
