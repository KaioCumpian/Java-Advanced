package org.example;

public class Jogo {

    // Atributos
    private Monte monte;
    private Jogador jogador;
    private Computador computador;

    // Construtor - Cria o monte, embaralha e cria os jogadores
    public Jogo() {
        monte = new Monte(); // Cria o monte de cartas
        monte.embaralhar();  // Embaralha o monte
        jogador = new Jogador(); // Cria o jogador
        computador = new Computador(); // Cria o computador
    }

    // Método que distribui uma carta para um jogador
    public Carta distribuiCartaParaJogador(Jogador jogador) {
        // Se o jogador já parou, não distribui carta e retorna null
        if (jogador.parou()) {
            return null;
        }
        // Caso contrário, distribui uma carta virada do monte
        Carta carta = monte.virar();
        if (carta != null) {
            jogador.receberCarta(carta);
        }
        return carta;
    }

    // Método que verifica se o jogo acabou
    public boolean acabou() {
        // O jogo acaba quando ambos os jogadores pararam ou qualquer um passou de 21 pontos
        return jogador.parou() && computador.parou() || jogador.getPontos() > 21 || computador.getPontos() > 21;
    }

    // Método que retorna o resultado do jogo
    public String resultado() {
        if (jogador.getPontos() > 21) {
            return "Você perdeu"; // Jogador passou de 21
        } else if (computador.getPontos() > 21) {
            return "Você ganhou"; // Computador passou de 21
        } else if (jogador.getPontos() > computador.getPontos()) {
            return "Você ganhou"; // Jogador tem mais pontos que o computador
        } else if (jogador.getPontos() < computador.getPontos()) {
            return "Você perdeu"; // Computador tem mais pontos que o jogador
        } else {
            return "Empate"; // Empate
        }
    }

    // Getters
    public Computador getComputador() {
        return computador;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void turno() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turno'");
    }
}
