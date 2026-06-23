package com.example.userauth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginRequest {
    @Email
    private String email;
    @Size(min = 8)
    private String password;
}
