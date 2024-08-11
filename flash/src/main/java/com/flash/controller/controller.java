package com.flash.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name="Sanitise API")
public class controller {

    @Operation(
            summary = "Sanitise Keywords in String",
            description = "Take in a string body and return it with the sql keywords masked")
    @PostMapping("/sanitise")
    public String sanitise(String sentence){
        return sentence;

    }

}
