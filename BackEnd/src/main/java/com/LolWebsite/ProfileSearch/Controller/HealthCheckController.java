package com.LolWebsite.ProfileSearch.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/HealthCheck")
@CrossOrigin
public class HealthCheckController {

    @GetMapping("/Health")
    public String HealthCheck(){


        return "Health Check Good";
    }
}
