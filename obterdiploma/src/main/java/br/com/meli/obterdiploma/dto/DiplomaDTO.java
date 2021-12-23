package br.com.meli.obterdiploma.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiplomaDTO {

    private String aluno;
    private double nota;
    private String mensagem;

}
