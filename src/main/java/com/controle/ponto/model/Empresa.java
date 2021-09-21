package com.controle.ponto.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Empresa  {

    //private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private String email;

    @OneToOne
    private Funcionario funcionario;

    @OneToOne
    private Funcao funcao;

}
