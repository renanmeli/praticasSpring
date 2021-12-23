package br.com.meli.obterdiploma.controller;

import br.com.meli.obterdiploma.dto.DiplomaDTO;
import br.com.meli.obterdiploma.model.Aluno;
import br.com.meli.obterdiploma.service.DiplomaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class DiplomaController {

    @Autowired
    DiplomaServices diplomaServices;


    @PostMapping(value = "/diploma")
    public DiplomaDTO gerarDiplomaViaPost(@RequestBody Aluno aluno) {
        return diplomaServices.gerarDiploma(aluno);
    }
}
