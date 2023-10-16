package org.es2locadora.unit;

import java.time.LocalDate;

import org.es2locadora.builder.ClienteBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    public void naoDeveCriarClienteComCPFInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ClienteBuilder.novoCliente().comNome("Fulano Santos").comCpf("123").comTelefone1("12345678910")
                    .comTelefone2("12345678910").comEmail("fulanosantos@email.com")
                    .comDtNascimento(LocalDate.now()).build();
        }, "Deveria lançar IllegalArgumentException");
    }

    @Test
    void naoDeveCriarUmClienteComCPFNulo() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            ClienteBuilder.novoCliente().comNome("Fulano Santos").comCpf(null).comTelefone1("12345678910")
                    .comTelefone2("12345678910").comEmail("fulanosantos@email.com")
                    .comDtNascimento(LocalDate.now()).build();
        }, "Deveria lançar NullPointerException");
    }
}
