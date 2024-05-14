package org.example.model;

import java.util.ArrayList;

public class Environment {

    private String noome;
    private int altura;
    private int largura;
    private ArrayList<Objeto> objetos;
    private ArrayList<Character> personagens;

    public Environment() {

    }

    public Environment(String noome, int altura, int largura, ArrayList<Objeto> objetos) {
        this.noome = noome;
        this.altura = altura;
        this.largura = largura;
        this.objetos = objetos;
    }

    public void colisao(Character sonic, Objeto ring, Character monkey) {
        if((sonic.getPosicaoX() == ring.getPosicaoX()) && (sonic.getPosicaoY() == ring.getPosicaoY())){

            sonic.getItens().add(ring);
            System.out.println("Sonic coletou uma moeda.");

        }

        if((sonic.getPosicaoX() == monkey.getPosicaoX()) && (sonic.getPosicaoY() == monkey.getPosicaoY())){

            if(sonic.getPosicaoY() > 2){
                monkey.setNumDeVidas(monkey.getNumDeVidas() - 1);
                System.out.println("Sonic colidiu com Monkey e Monkey morreu.");
            }else{
                sonic.setNumDeVidas(sonic.getNumDeVidas() - 1);
                System.out.println("Sonic colidiu com Monkey e morreu.");


            }
        }

    }

    public String getNoome() {
        return noome;
    }

    public void setNoome(String noome) {
        this.noome = noome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<Objeto> objetos) {
        this.objetos = objetos;
    }

    public ArrayList<Character> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(ArrayList<Character> personagens) {
        this.personagens = personagens;
    }

}