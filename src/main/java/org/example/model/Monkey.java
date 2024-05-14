package org.example.model;

import java.util.ArrayList;

public class Monkey extends Character{

    public Monkey() {
    }

    public Monkey(String nome, int numDeVidas, int ring, int posicaoX, int posicaoY, ArrayList<Objeto> itens) {
        super(nome, numDeVidas, ring, posicaoX, posicaoY, itens);
    }


    @Override
    public void movimentar(String direcao){
        if(direcao == "FRENTE"){
            if(posicaoX < 100){
                posicaoX++;
            }

        }else if(direcao == "TRAS"){
            if(posicaoX > 100){
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
        }else if(direcao == "SUBIR EM ARVORE"){
            posicaoY++;



        }

    }
}
