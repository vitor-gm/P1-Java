package org.example;

import org.example.model.Character;
import org.example.model.Environment;
import org.example.model.Objeto;

import java.util.ArrayList;


public class MyApp {

    public static void main(String[] args) {


    Character sonic = new Character("Sonic", 3, 100, 5, 10, new ArrayList<>());
    Character tails = new Character("Tails", 3, 150, 0, 0, new ArrayList<>());
    Character monkey = new Character("Monkey", 3, 100, 5, 10, new ArrayList<>());


    ArrayList<Objeto> objetos = new ArrayList<Objeto>();

    Objeto ring1 = new Objeto("Ring1", 5, 10);
    Objeto ring2 = new Objeto("Ring2", 0, 0);
    Objeto ring3 = new Objeto("Ring3", 0, 0);
    Objeto box = new Objeto("Box", 0, 0);

    objetos.add(ring1);
    objetos.add(ring2);
    objetos.add(ring3);

    Environment ambiente = new Environment("Hill Top Zone", 100, 100, objetos);

    ambiente.setPersonagens(new ArrayList<>());
    ambiente.getPersonagens().add(sonic);
    ambiente.getPersonagens().add(tails);
    ambiente.getPersonagens().add(monkey);



    ambiente.colisao(sonic, ring1, monkey);



    for(Objeto item : sonic.getItens()){
        System.out.println(item.getNome());
    }

    /*sonic.movimentar("FRENTE");
    sonic.movimentar("FRENTE");
    sonic.movimentar("CIMA");
    sonic.movimentar("CIMA");*/



    }



}