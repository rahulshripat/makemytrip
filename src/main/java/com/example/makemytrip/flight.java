package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight {
    @GetMapping("/flight")
    public String getData() {return  "Please  book flights and holidays indigo ticket with 50% discount" ; }
}
