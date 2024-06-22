package com.example.final_project_jayme.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Prontuario {

    private Long id;
    private Date dtEntrada;
    private Date dtAlta;
    private Date dtNascimento;
    private String convenio;
    private Paciente paciente;

}
