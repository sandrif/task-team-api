package com.sandra.task_team_api.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

record StatusResponse(String status) {}

@RestController
public class HealthController {

    @GetMapping("/health")
    public StatusResponse health() {
        return new StatusResponse("ok");
    }
}