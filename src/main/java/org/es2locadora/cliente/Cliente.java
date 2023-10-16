package org.es2locadora.cliente;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "nome_cliente")

    @NonNull
    private String nomeCliente;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;
    private String telefone1;
    private String telefone2;
    private String email;

    @Column(name = "dt_nascimento")
    private LocalDate dtNascimento;
}
