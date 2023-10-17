package org.es2locadora.locacao;

import java.time.LocalDate;

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
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locacao", unique = true)
    private Long idLocacao;

    @Column(name = "id_imovel")
    private Long idImovel;

    @Column(name = "id_inquilino")
    private Long idInquilino;

    @Column(name = "valor_aluguel")
    private Double valorAluguel;

    @Column(name = "percentual_multa")
    private Double percentualMulta;

    @Column(name = "dia_vencimento")
    private Integer diaVencimento;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    private Boolean ativo;

    private String obs;

}
