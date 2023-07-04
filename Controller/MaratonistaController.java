package com.example.corridanaselva.Controller;

import com.example.corridanaselva.Entity.MaratonistaEntity;
import com.example.corridanaselva.Service.MaratonistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1")
@RestController

public class MaratonistaController {
    @Autowired
    private MaratonistaService maratonistaService;

    @GetMapping("maratonista")
    public List<MaratonistaEntity> listarMaratonista() {
        return maratonistaService.buscarMaratonistas();
    }

    @GetMapping("maratonista/(id)")
    public MaratonistaEntity buscarMaratonistaPorId(@PathVariable long id) {
        return maratonistaService.buscarMaratonistaPorId(id);

    }
    @PostMapping("maratonista")
    public MaratonistaEntity salvarMaratonista(@RequestBody MaratonistaEntity maratonista) {
        return maratonistaService.adicionarMaratonista(maratonista);
    }
}



