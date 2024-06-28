package com.example.final_project_jayme.entities;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // @ManyToOne
    // @JoinColumn(name = "paciente_id")
    // private Paciente paciente;

    // @OneToMany(mappedBy = "paciente")
    // private List<Consulta> consultas;

    @ManyToOne // One Consulta belongs to one Paciente
    @JoinColumn(name = "paciente_id") // Foreign key column in Consulta table
    private Paciente paciente;
}
