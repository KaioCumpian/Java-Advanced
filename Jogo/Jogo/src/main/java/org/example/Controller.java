package org.example;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    // Atributo que armazena o objeto Jogo
    private Jogo jogo;

    // Construtor - Cria o jogo e inicializa o controlador
    public Controller() {
        jogo = new Jogo(); // Cria o jogo
    }

    // Método para iniciar um novo jogo
    public void novoJogo() {
        jogo = new Jogo(); // Cria um novo jogo
        jogo.getJogador().reiniciar(); // Reinicia o jogador
        jogo.getComputador().reiniciar(); // Reinicia o computador
        atualizarTela(); // Atualiza a interface gráfica
    }

    // Método para pedir uma carta
    public void pedirCarta() {
        jogo.distribuiCartaParaJogador(jogo.getJogador()); // Distribui uma carta para o jogador
        jogo.turno(); // Chama o método turno para distribuir a carta ao computador, se necessário
        verificarFimJogo(); // Verifica se o jogo terminou
        atualizarTela(); // Atualiza a interface gráfica
    }

    // Método para o jogador parar
    public void parar() {
        jogo.getJogador().parar(); // O jogador decide parar
        jogo.turno(); // Realiza o turno do computador
        verificarFimJogo(); // Verifica se o jogo terminou
        atualizarTela(); // Atualiza a interface gráfica
    }

    // Método que realiza a lógica de turno, distribui cartas e verifica se o jogo acabou
    private void turno() {
        jogo.distribuiCartaParaJogador(jogo.getComputador()); // Distribui carta para o computador
        verificarFimJogo(); // Verifica se o jogo acabou
    }

    // Método que verifica se o jogo terminou
    private void verificarFimJogo() {
        if (jogo.acabou()) {
            System.out.println(jogo.resultado()); // Exibe o resultado no console (pode ser substituído por um label na interface)
        }
    }

    // Método para atualizar a tela (interface gráfica)
    public void atualizarTela() {
        // Atualiza as cartas do jogador
        ImageView imagemJogador = criarImagemDaCarta(jogo.getJogador().ultimaCarta());
        // Atualiza as cartas do computador
        ImageView imagemComputador = criarImagemDaCarta(jogo.getComputador().ultimaCarta());
        
        // Aqui você pode configurar a exibição de cartas no seu layout gráfico, como em Labels ou ImageViews
        // Exemplo fictício de atualização visual
        // labelJogador.setGraphic(imagemJogador);
        // labelComputador.setGraphic(imagemComputador);
        
        // Você pode adicionar mais lógica de atualização de labels de pontos, status, etc.
    }

    // Método para criar a imagem da carta com base em uma instância da carta
    public ImageView criarImagemDaCarta(Carta carta) {
        if (carta == null) {
            return null; // Se a carta for null, não cria a imagem
        }

        String caminhoImagem = carta.imagePath(); // Obtém o caminho da imagem
        Image imagem = new Image(caminhoImagem); // Cria a imagem a partir do caminho
        return new ImageView(imagem); // Retorna um ImageView com a imagem da carta
    }
}
