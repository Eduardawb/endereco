package com.example.corridanaselva.Controller;

import com.example.corridanaselva.Service.CircuitoService;
import com.example.corridanaselva.Service.MaratonaService;
import com.example.corridanaselva.Service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
@RestController

public class CircuitoController {
    @Autowired
    private CircuitoService circuitoService;

    @PostMapping("Circuito")
    public CircuitoService buscarCircuito(@PathVariable) {
        return (CircuitoService) circuitoService.buscarCircuitos();
    }


}
