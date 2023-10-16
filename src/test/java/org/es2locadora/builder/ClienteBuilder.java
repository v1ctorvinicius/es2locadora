package org.es2locadora.builder;

import org.es2locadora.cliente.Cliente;

public class ClienteBuilder {
    private Cliente cliente;
    public static int quantidade = 0;

    private ClienteBuilder() {
    }

    public static ClienteBuilder novoCliente() {
        ClienteBuilder builder = new ClienteBuilder();
        builder.cliente = new Cliente();
        return builder;
    }

    public ClienteBuilder comNome(String nome) {
        cliente.setNomeCliente(nome);
        return this;
    }

    public ClienteBuilder comCpf(String cpf) {
        cliente.setCpf(cpf);
        return this;
    }

    public Cliente build() {
        return cliente;
    }

}
