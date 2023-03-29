package com.demo.cliente.api.reactive.repository;

import com.demo.cliente.api.reactive.model.Cliente;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface ClienteRepository extends ReactiveMongoRepository<Cliente, Integer> {

}
