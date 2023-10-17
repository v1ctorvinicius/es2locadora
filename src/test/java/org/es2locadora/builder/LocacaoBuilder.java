package org.es2locadora.builder;

import org.es2locadora.locacao.Locacao;

import java.time.LocalDate;

public class LocacaoBuilder {
    private Locacao locacao;

    public static int quantidade = 0;

    private LocacaoBuilder() {}

    public static LocacaoBuilder novoAluguel() {
        LocacaoBuilder builder = new LocacaoBuilder();
        builder.locacao = new Locacao();
        quantidade++;
        return builder;
    }

    public LocacaoBuilder comIdImovel(Long idImovel) {
        this.locacao.setIdImovel(idImovel);
        return this;
    }

    public LocacaoBuilder comIdInquilino(Long idInquilino) {
        this.locacao.setIdInquilino(idInquilino);
        return this;
    }

    public LocacaoBuilder comValorAluguel(Double valorAluguel) {
        this.locacao.setValorAluguel(valorAluguel);
        return this;
    }

    public LocacaoBuilder comPercentualMulta(Double percentualMulta) {
        this.locacao.setPercentualMulta(percentualMulta);
        return this;
    }

    public LocacaoBuilder comDiaVencimento(Integer diaVencimento) {
        this.locacao.setDiaVencimento(diaVencimento);
        return this;
    }

    public LocacaoBuilder comDataInicio(LocalDate dataInicio) {
        this.locacao.setDataInicio(dataInicio);
        return this;
    }

    public LocacaoBuilder comDataFim(LocalDate dataFim) {
        this.locacao.setDataFim(dataFim);
        return this;
    }

    public LocacaoBuilder comAtivo(Boolean ativo) {
        this.locacao.setAtivo(ativo);
        return this;
    }

    public LocacaoBuilder comObs(String obs) {
        this.locacao.setObs(obs);
        return this;
    }

    public Locacao build() {
        return this.locacao;
    }
}
