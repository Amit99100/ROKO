package com.example.demo;

import org.apache.coyote.Request;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ( "/")
public class Test {


    @GetMapping
    public String getDate ( ){
        return "amit this is docker unning Here ";
    }


    @GetMapping( value = "/Home")
    public String getDate1 ( ){
        return "This is home page buddy ";
    }

}
