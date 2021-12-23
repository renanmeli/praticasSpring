package br.com.meli.numromanos.controller;

import org.springframework.web.bind.annotation.*;

@RestController //Define a classe como um controller
@RequestMapping(value = "/convertenum")
public class NumromanosController {

    public int [] valores = {10, 9, 5, 4, 1};
    public String [] letras = {"X", "IX", "V", "IV", "I"};

    //Exemplo de chamada -> http://localhost:8080/convertenum/23
    @GetMapping("/{number}")
    public String roman(@PathVariable int number){

        String romano="";

        for(int i=0; i<valores.length; i++){
            while(number>=valores[i]){
                number-=valores[i];
                romano+=letras[i];
            }
        }
        return romano;
    }

    //Exemplo de chamada -> http://localhost:8080/convertenum?number=23
    @GetMapping()
    public String roman01(@RequestParam int number){
        String romano="";

        for(int i=0; i<valores.length; i++){
            while(number>=valores[i]){
                    number-=valores[i];
                    romano+=letras[i];
                }
            }
        return romano;
    }
}
