package com.progrramwithnitesh.restservice.RestApp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("welcomepo")
public String index()
{
    return "Hello World ";
}

}

