package org.es2locadora.builder;

import java.time.LocalDate;

import org.es2locadora.aluguel.Aluguel;

public class AluguelBuilder {
    private Aluguel aluguel;
    public static int quantidade = 0;

    private AluguelBuilder() {
    }

    public static AluguelBuilder novoAluguel() {
        AluguelBuilder builder = new AluguelBuilder();
        builder.aluguel = new Aluguel();
        quantidade++;
        return builder;
    }

    public AluguelBuilder comId(Long id) {
        this.aluguel.setIdLocacao(id);
        return this;
    }

    public AluguelBuilder comDataVencimento(LocalDate dataVencimento) {
        this.aluguel.setDataVencimento(dataVencimento);
        return this;
    }

    public AluguelBuilder comValorPago(Double valorPago) {
        this.aluguel.setValorPago(valorPago);
        return this;
    }

    public AluguelBuilder comDataPagamento(LocalDate dataPagamento) {
        this.aluguel.setDataPagamento(dataPagamento);
        return this;
    }

    public AluguelBuilder comObs(String obs) {
        this.aluguel.setObs(obs);
        return this;
    }

    public Aluguel build() {
        return this.aluguel;
    }

}
