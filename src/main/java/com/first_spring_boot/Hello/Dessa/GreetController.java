package com.first_spring_boot.Hello.Dessa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping()
    public String helloDad(){
        return "Hello Dessalew";
    }
    @GetMapping(path =  "/lunch")
    public String lunchTime(){
        return "what time you eat your lunch>?";
    }
@GetMapping (path = "/bedtime")
    public String homeYouDo(){
        return "Thank you Dad";
}
}
