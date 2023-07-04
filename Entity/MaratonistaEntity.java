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

public class MaratonistaEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idade;
    private long id;
    private String tipoSnguineo;
    private String nome;
    private String numeroCelular;
    private String numeroEmergencia;
    private String rg;
    private String sobrenome;

    public void add(MaratonistaEntity maratonista) {
    }
}
