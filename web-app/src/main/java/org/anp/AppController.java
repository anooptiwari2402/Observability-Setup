package org.anp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AppController {

    @GetMapping("/health")
    public String healthCheck(){
        return "OK";
    }
}
