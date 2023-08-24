package org.dio.service.impl;

import org.dio.model.Cliente;
import org.dio.model.ClienteRepository;
import org.dio.model.EnderecoRepository;
import org.dio.service.ClienteService;
import org.dio.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

// Strategy: Implementar os métodos definidos na interface.
// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente findById(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void add(Cliente cliente) {
        salvarClienteComCep(cliente);

    }

    @Override
    public void update(Long id, Cliente cliente) {

    }

    @Override
    public void delete(Long id) {

    }
}
