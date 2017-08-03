package com.helen.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String HELLO_VALUE = "Hello , ";
    private static final String ID_VALUE = "id value : ";

    /**
     * http://localhost:8080/greeting?name=abc
     * 
     * @param name
     * @return
     */
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return HELLO_VALUE + name;
    }
    
    /**
     * http://localhost:8080/getStatus?id=3
     * 
     * @param id
     * @return
     */
    @RequestMapping(value = "/getStatus", method = RequestMethod.GET)
    public String getStatus(@RequestParam(value="id") int id) {
    		return ID_VALUE + String.valueOf(id);
    }
}
