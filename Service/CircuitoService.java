package com.example.corridanaselva.Service;

import com.example.corridanaselva.Entity.CircuitoEntity;
import com.example.corridanaselva.Entity.MaratonistaEntity;
import com.example.corridanaselva.Repository.CircuitoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping
@RestController
public class CircuitoService {
    public List<CircuitoEntity> buscarCircuitos() {
        return buscarCircuitos();
    }

    public CircuitoEntity buscarCircuitoPorId(long id) {
        return circuitoRepository.bucarCircuitoPorId(id);
    }

    public CircuitoEntity adicionarCircuito(CircuitoEntity circuito) {
        return buscarCircuitoPorId(id);
    }
