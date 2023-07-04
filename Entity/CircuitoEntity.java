package com.example.corridanaselva.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CircuitoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String categoria;
    private String distamcia;

    public void add(CircuitoEntity circuito) {
    }
}
