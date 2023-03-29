package com.demo.cliente.api.reactive.model;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Document
public class Cliente {

    @Id
    int id;
    String identificacion;
    String nombres;
    String apellidos;
    private String paisResidencia;
    private String paisNacimiento;
    private String direccion;
    private boolean telefono;
}