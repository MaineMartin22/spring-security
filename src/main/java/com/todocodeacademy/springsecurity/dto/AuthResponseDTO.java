package com.todocodeacademy.springsecurity.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;

/* Cuando una clase se declara como un registro, el compilador de Java genera automáticamente
ciertos métodos como el constructor, los métodos equals(), hashCode() y toString(),
basados en los componentes de datos declarados en la clase. */
@Builder
@JsonPropertyOrder({"username", "message", "jwt", "status"})
public record AuthResponseDTO (String username, String message, String jwt, boolean status) {

}