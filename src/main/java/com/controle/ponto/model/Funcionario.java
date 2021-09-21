package com.controle.ponto.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer idade;
    private String cpf;
    private String endereco;
    private String telefone;

    @OneToOne
    private Funcao funcao;

    @OneToOne
    private HorarioTrabalho horario;
}
