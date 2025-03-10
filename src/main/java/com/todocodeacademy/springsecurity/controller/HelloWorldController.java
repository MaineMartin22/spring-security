package com.todocodeacademy.springsecurity.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("denyAll()")
public class HelloWorldController {

    @GetMapping("/holaseg")
    // @PreAuthorize("hasAuthority('READ')") se puede hacer por permisos
    @PreAuthorize("hasRole('ADMIN')") // o por roles (MEJOR)
    public String secHelloWorld() {

        return "Hola Mundo TodoCode con seguridad";
    }

    @GetMapping("/holanoseg")
    @PreAuthorize("permitAll()")

    public String noSecHelloWorld() {

        return "Hola mundo TodoCode sin seguridad";
    }

}
