package org.example.model;

import java.util.ArrayList;

public class Character {

    private String nome;
    private int numDeVidas;
    private int ring;
    protected int posicaoX;
    protected int posicaoY;
    protected ArrayList<Objeto> itens;


    public Character(){

    }

    public Character(String nome, int numDeVidas, int ring, int posicaoX, int posicaoY, ArrayList<Objeto> itens) {
        this.nome = nome;
        this.numDeVidas = numDeVidas;
        this.ring = ring;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.itens = itens;
    }




    public void movimentar(String direcao){
        if(direcao == "FRENTE"){
            if(posicaoX < 100){
                posicaoX++;

            }

        }else if(direcao == "TRAS"){
            if(posicaoX > 0){
                posicaoX--;
            }

        }else if(direcao == "CIMA"){
            if(posicaoY < 100){
                posicaoY++;
            }
        }else if(direcao == "BAIXO"){
            if(posicaoY > 0){
                posicaoY--;
            }
        }
        System.out.println("Posicao final: x " + posicaoX + " y " + posicaoY);
    }

    public ArrayList<Objeto> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Objeto> itens) {
        this.itens = itens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumDeVidas() {
        return numDeVidas;
    }

    public void setNumDeVidas(int numDeVidas) {
        this.numDeVidas = numDeVidas;
    }

    public int getRing() {
        return ring;
    }

    public void setRing(int ring) {
        this.ring = ring;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }


}
