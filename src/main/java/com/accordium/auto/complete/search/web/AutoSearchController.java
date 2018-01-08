package com.accordium.auto.complete.search.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AutoSearchController {

    /*@RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }*/

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping("/hello")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "autocomplete";
    }

}
