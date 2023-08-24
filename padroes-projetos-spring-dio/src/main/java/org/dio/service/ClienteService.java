package org.dio.service;

import org.dio.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente findById(Long id);
    void add(Cliente cliente);
    void update(Long id, Cliente cliente);
    void delete(Long id);
}
