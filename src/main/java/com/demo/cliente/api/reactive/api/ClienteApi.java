package com.demo.cliente.api.reactive.api;

import com.demo.cliente.api.reactive.model.Cliente;
import com.demo.cliente.api.reactive.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/v1/api/cliente")
public class ClienteApi {
    @Autowired
    private ClienteService clienteService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Cliente cliente){
        clienteService.create(cliente);
    }

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Cliente> findAll() {
        return clienteService.findAll();
    }

}
