package br.com.meli.obterdiploma.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data //não precisa criar get and setters | equivale ao get and setter dos atributos
@NoArgsConstructor //gera o construtor vazio
@AllArgsConstructor //gera o construtor com todos parametros
public class Aluno {

    private String nome;
    private List<Disciplina> disciplinas;
}
