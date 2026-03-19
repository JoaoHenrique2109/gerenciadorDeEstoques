package GerenciadorLoja.repositorios;

import java.util.*;
import GerenciadorLoja.persons.Cliente;

public class MemoriaClienteRepository implements ClienteRepository {
    @Override
    public void salvar(Cliente cliente) { clientes.put(cliente.getCpf(), cliente); }

    @Override
    public void atualizar(Cliente cliente) {
        clientes.put(cliente.getCpf(), cliente);
    }

    @Override
    public void deletar(String cpf) {
        clientes.remove(cpf);
    }

    @Override
    public Optional<Cliente> buscarPorCpf(String cpf) {
        return Optional.ofNullable(clientes.get(cpf));
    }

    @Override
    public List<Cliente> buscarTodos() {
        return List.of();
    }

    private Map<String, Cliente> clientes = new HashMap<>();
}
