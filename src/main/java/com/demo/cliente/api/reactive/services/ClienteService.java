package com.demo.cliente.api.reactive.services;

import com.demo.cliente.api.reactive.model.Cliente;
import com.demo.cliente.api.reactive.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public void create(Cliente employee) {
        clienteRepository.save(employee).subscribe();
    }
    public Flux<Cliente> findAll() {
        return clienteRepository.findAll();
    }

}
