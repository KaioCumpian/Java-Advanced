package org.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    // Atributos
    private int pontos = 0;
    private List<Carta> cartas = new ArrayList<>();
    private boolean parou = false;

    // Método para receber uma carta
    public void receberCarta(Carta carta) {
        // Adiciona a carta à mão do jogador
        cartas.add(carta);

        // Adiciona o valor da carta aos pontos do jogador
        pontos += carta.getNumero();
    }

    // Método para o jogador parar
    public void parar() {
        parou = true;
    }

    // Método para obter as cartas do jogador
    public List<Carta> getCartas() {
        return cartas;
    }

    // Método para obter os pontos do jogador
    public int getPontos() {
        return pontos;
    }

    // Método para verificar se o jogador parou
    public boolean parou() {
        return parou;
    }

    public void reiniciar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reiniciar'");
    }
}
