package com.todocodeacademy.springsecurity.controller;

import com.todocodeacademy.springsecurity.dto.AuthLoginRequestDTO;
import com.todocodeacademy.springsecurity.dto.AuthResponseDTO;
import com.todocodeacademy.springsecurity.service.impl.UserDetailsServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final UserDetailsServiceImpl userDetailsService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> login(@RequestBody @Valid AuthLoginRequestDTO authLoginRequestDTO) {
        return new ResponseEntity<>(this.userDetailsService.loginUser(authLoginRequestDTO), HttpStatus.OK);
    }
}
