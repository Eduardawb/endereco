package com.example.corridanaselva.Service;

import com.example.corridanaselva.Controller.Maratona;
import com.example.corridanaselva.Repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@Service
@RequestMapping
@RestController
public class MaratonaService {
    private MaratonistaRepository maratonistaRepository;

    @Autowired
    public MaratonaService(MaratonistaRepository maratonistaRepository){
        this.maratonistaRepository = maratonistaRepository;
    }
    public Maratona buscarMaratonista (Long id){
        return maratonistaRepository.findById(id).get();
    }
    public MaratonistaService salvarMaratonista(MaratonistaService ){
        return maratonistaRepository.save(salvarMaratonista()
    }
    public List listarMaratonas() {
    }
}
