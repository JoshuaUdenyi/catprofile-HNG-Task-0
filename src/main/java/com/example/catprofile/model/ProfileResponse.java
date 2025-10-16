package com.example.catprofile.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProfileResponse{
    private String status;
    private User user;
    private String timestamp;
    private String fact;
}

