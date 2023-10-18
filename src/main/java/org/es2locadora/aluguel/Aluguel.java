package org.es2locadora.aluguel;

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
public class Aluguel {

    @Id
    @Column(name = "id_locacao", unique = true)
    private Long idLocacao;

    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;

    @Column(name = "valor_pago")
    private Double valorPago;

    @Column(name = "data_pagamento")
    private LocalDate dataPagamento;

    @Column(name = "obs")
    private String obs;

    public boolean estaPago(){
        return dataPagamento != null && valorPago != null && valorPago > 0  && dataPagamento.isAfter(LocalDate.now());
    }
}
