package org.example.model;

import java.util.ArrayList;

public class Sonic extends Character{

    public Sonic(String nome, int numDeVidas, int pontuacao, int posicaoX, int posicaoY, ArrayList<Objeto> itens) {
        super(nome, numDeVidas, pontuacao, posicaoX, posicaoY, itens);

    }




    @Override
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
        }else if(direcao == "PULAR"){
                if(getPosicaoY() < 5){
                    posicaoX++;
                    posicaoY++;
                    posicaoY = 0;

                }


        }
        System.out.println("Posicao final: x " + posicaoX + " y " + posicaoY);

    }



}
