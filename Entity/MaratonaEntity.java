package com.example.corridanaselva.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaratonaEntity {

    @Id
    private int id;
    private double valorIncricao;
    private CircuitoEntity circuito;

    @ManyToOne
    @JoinColumn(name = "incricao")
    private MaratonistaEntity maratonista;

}
