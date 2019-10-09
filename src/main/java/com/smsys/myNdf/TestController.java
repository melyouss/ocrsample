package com.smsys.myNdf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mohamed on 06/10/2019.
 */
@RestController
public class TestController {

    @GetMapping(path="/")
    public String get() {

        return  "Hello World";
    }
}
