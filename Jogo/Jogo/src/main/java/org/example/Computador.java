package org.example;

public class Computador extends Jogador {

    @Override
    public boolean parou() {
        return this.getPontos() > 16;
    }

    public void reiniciar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reiniciar'");
    }
}
