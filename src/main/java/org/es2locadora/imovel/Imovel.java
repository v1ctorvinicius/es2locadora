package org.es2locadora.imovel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imovel", unique = true)
    private Long idImovel;

    @Column(name = "tipo_imovel", length = 100, unique = true)
    private String tipoImovel;

    private String endereco;

    @Column(length = 45)
    private String bairro;

    @Column(length = 8)
    private String cep;

    private Double metragem;

    private Integer dormitorios;

    private Integer banheiros;

    private Integer suites;

    @Column(name = "vagas_garagem")
    private Integer vagasGaragem;

    @Column(name = "valor_aluguel_sugerido")
    private Double valorAluguelSugerido;

    private String obs;
}
