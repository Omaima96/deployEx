package co.develhope.deployEx.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping
    public String getName(String devName){
        devName = "omaima";
        return devName;
    }

}
