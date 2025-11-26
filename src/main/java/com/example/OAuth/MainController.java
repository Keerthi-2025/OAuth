package com.example.OAuth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

@RequestMapping("/")
    public  String home(){
    return "Welcome Home!";

}
}
