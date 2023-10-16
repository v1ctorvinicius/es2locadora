package org.es2locadora.builder;

import java.time.LocalDate;

import org.es2locadora.cliente.Cliente;

public class ClienteBuilder {
    private Cliente cliente;
    public static int quantidade = 0;

    private ClienteBuilder() {
    }

    public static ClienteBuilder novoCliente() {
        ClienteBuilder builder = new ClienteBuilder();
        builder.cliente = new Cliente();
        quantidade++;
        return builder;
    }

    public ClienteBuilder comNome(String nome) {
        this.cliente.setNomeCliente(nome);
        return this;
    }

    public ClienteBuilder comCpf(String cpf) {
        this.cliente.setCpf(cpf);
        return this;
    }

    public ClienteBuilder comTelefone1(String telefone1) {
        this.cliente.setTelefone1(telefone1);
        return this;
    }

    public ClienteBuilder comTelefone2(String telefone2) {
        this.cliente.setTelefone2(telefone2);
        return this;
    }

    public ClienteBuilder comEmail(String email) {
        this.cliente.setEmail(email);
        return this;
    }

    public ClienteBuilder comDtNascimento(LocalDate dtNascimento) {
        this.cliente.setDtNascimento(dtNascimento);
        return this;
    }

    public Cliente build() {
        return cliente;
    }

}
