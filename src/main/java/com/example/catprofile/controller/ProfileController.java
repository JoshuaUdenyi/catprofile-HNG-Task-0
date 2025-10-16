package com.example.catprofile.controller;

import com.example.catprofile.model.ProfileResponse;
import com.example.catprofile.model.User;
import com.example.catprofile.service.CatFactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
public class ProfileController {
    private final CatFactService catFactService;

    public ProfileController(CatFactService catFactService) {
        this.catFactService = catFactService;

    }

    @Value("${profile.email}")
    private String email;

    @Value("${profile.name}")
    private String name;

    @Value("${profile.stack}")
    private String stack;

    @GetMapping(value = "/me", produces = "application/json")
    public ProfileResponse getProfile() {
        log.info("Received request for /me endpoint");
        String fact = catFactService.getCatFact();
        ProfileResponse response = new ProfileResponse(
                "success",
                new User(name, email, stack),
                Instant.now().toString(),
                fact
        );
        log.info("Returning response for /me: {}", response);
        return response;
    }
}
