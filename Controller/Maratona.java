package com.example.corridanaselva.Controller;

import com.example.corridanaselva.Service.MaratonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Repository
public class Maratona {

    @Autowired
    private MaratonaService maratonaService;

    @PostMapping("maratona")
    public List <Maratona> salvarMaratona(@RequestBody Maratona maratona){
        return ResponseEntity.status(HttpStatus.CREATED).body(maratonaService).salvarMaratona(maratona);

        }
        @GetMapping("maratona/{id}")
public Maratona buscarMaratonaPorID(@PathVariable long id)
            return MaratonaService.buscarMaratona
    }

