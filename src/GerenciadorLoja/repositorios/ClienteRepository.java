package GerenciadorLoja.repositorios;

import java.util.List;
import java.util.Optional;

import GerenciadorLoja.persons.Cliente;

public interface ClienteRepository {
    void salvar(Cliente cliente);
    void atualizar (Cliente cliente);
    void deletar (String cpf);
    Optional<Cliente> buscarPorCpf (String cpf);
    List<Cliente> buscarTodos();

}
