package com.webfullstackdev.simpleprog.spb.spbmssimpleprogramming;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")    // @RequestMapping("/")  ->> //// no of // at the plain getMapping
public class MyFirstRestController {

    //@GetMapping ==   @GetMapping() ==  @GetMapping("")   !=  @GetMapping("/")-> first/ expect at the end

    @GetMapping()
    public String getFirstApi(){
        return "Simple programming - Rest API response as simple string";
    }
}
