package com.example.corridanaselva.Controller;

import com.example.corridanaselva.Service.CircuitoService;
import com.example.corridanaselva.Service.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sistema")

public class InscricaoController {

    @Autowired
    private InscricaoService inscricaoService;


    @PostMapping("inscricao")
public List<Incricao> salvarIscricao(@RequestBody Incricao incricao){
        return Repository.status(HttpStatus.CREATED).boby(incricaoService.SalvarIncricao(incricao));

    }
    @GetMapping("icricao")
    public List<Incricao> ListarIncricao(){
        return incricaoService.listarIncricao
    }
}
