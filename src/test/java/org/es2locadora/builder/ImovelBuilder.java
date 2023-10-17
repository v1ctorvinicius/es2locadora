package org.es2locadora.builder;

import org.es2locadora.imovel.Imovel;

public class ImovelBuilder {

    private Imovel imovel;

    public static int quantidade = 0;

    private ImovelBuilder() {
    }

    public static ImovelBuilder novoImovel() {
        ImovelBuilder builder = new ImovelBuilder();
        builder.imovel = new Imovel();
        quantidade++;
        return builder;
    }

    public ImovelBuilder comTipoImovel(String tipoImovel) {
        this.imovel.setTipoImovel(tipoImovel);
        return this;
    }

    public ImovelBuilder comEndereco(String endereco) {
        this.imovel.setEndereco(endereco);
        return this;
    }

    public ImovelBuilder comBairro(String bairro) {
        this.imovel.setBairro(bairro);
        return this;
    }

    public ImovelBuilder comCep(String cep) {
        this.imovel.setCep(cep);
        return this;
    }

    public ImovelBuilder comMetragem(Double metragem) {
        this.imovel.setMetragem(metragem);
        return this;
    }

    public ImovelBuilder comDormitorios(Integer dormitorios) {
        this.imovel.setDormitorios(dormitorios);
        return this;
    }

    public ImovelBuilder comBanheiros(Integer banheiros) {
        this.imovel.setBanheiros(banheiros);
        return this;
    }

    public ImovelBuilder comSuites(Integer suites) {
        this.imovel.setSuites(suites);
        return this;
    }

    public ImovelBuilder comVagasGaragem(Integer vagasGaragem) {
        this.imovel.setVagasGaragem(vagasGaragem);
        return this;
    }

    public ImovelBuilder comValorAluguelSugerido(Double valor) {
        this.imovel.setValorAluguelSugerido(valor);
        return this;
    }

    public ImovelBuilder comObs(String obs) {
        this.imovel.setObs(obs);
        return this;
    }

    public Imovel build() {
        return this.imovel;
    }


}
