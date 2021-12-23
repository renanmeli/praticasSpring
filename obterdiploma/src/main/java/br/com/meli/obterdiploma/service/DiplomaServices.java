package br.com.meli.obterdiploma.service;

import br.com.meli.obterdiploma.dto.DiplomaDTO;
import br.com.meli.obterdiploma.model.Aluno;
import br.com.meli.obterdiploma.model.Disciplina;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiplomaServices {

    public DiplomaDTO gerarDiploma(Aluno a){

        double media = calcularMedia(a);
        String mensagem = parabeniza(media);

        return DiplomaDTO.builder().aluno("teste").nota(20).build();
    }

    private double calcularMedia(Aluno a){
        List<Disciplina> disciplinas = a.getDisciplinas();
        double media = 0;

        for (Disciplina d: disciplinas){
            media += d.getNota();
        }
        return media / disciplinas.size();
    }

    private String parabeniza(double media){
        return media > 9 ? "PARABÉNS, VOCE É FERA" : null;
    }
}
