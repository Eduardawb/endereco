package com.example.corridanaselva.Service;

import com.example.corridanaselva.Entity.MaratonistaEntity;
import com.example.corridanaselva.Repository.MaratonistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Service
@RequestMapping
@RestController
public class MaratonistaService {

    @Autowired
    private MaratonistaRepository maratonistaRepository;
    public List<MaratonistaEntity> buscarMaratonistas() {
        return maratonistaRepository.buscarMaratonistas();
    }
    public MaratonistaEntity buscarMaratonistaPorId(long id) {
        return maratonistaRepository.bucarMaratonistaPorId(id);
    }


    }





