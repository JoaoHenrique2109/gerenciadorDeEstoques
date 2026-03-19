package GerenciadorLoja.service;
import GerenciadorLoja.persons.Cliente;
import GerenciadorLoja.repositorios.ClienteRepository;

import java.util.List;
import java.util.Optional;

public class ClienteService {
    private final  ClienteRepository clienteRepository;
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    public void cadastrarCliente(Cliente cliente) {

        if (cliente == null) {
            throw new IllegalArgumentException("O cliente não pode ser nulo.");
        }

        String cpf = cliente.getCpf();

        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("O cliente não possui CPF cadastrado!");
        }
        clienteRepository.salvar(cliente);
    }

}
