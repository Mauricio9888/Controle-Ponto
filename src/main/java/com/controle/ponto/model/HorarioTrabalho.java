package com.controle.ponto.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HorarioTrabalho")
public class HorarioTrabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate date;

    @NotNull
    @Column(name = "turno")
    private String turno;

    @NotNull
    @Column(name = "horarioEntrada")
    private String horarioEntrada = "HH:mm:ss";

    @NotNull
    @Column(name = "horarioSaida")
    private String horarioSaida = "HH:mm:ss";

}
