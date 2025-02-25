package org.example;

import org.example.Naipe;

public class Carta {

    // Atributos
    private int numero;
    private Naipe naipe;

    // Construtor
    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    // Método para obter o número da carta
    public int getNumero() {
        return numero;
    }

    // Método para obter o naipe da carta
    public Naipe getNaipe() {
        return naipe;
    }

    // Método para obter o caminho da imagem da carta
    public String imagePath() {
        // Retorna o caminho da imagem com base no número e no naipe
        String numeroStr = (numero <= 9) ? "0" + numero : Integer.toString(numero); // Adiciona zero à frente para números menores que 10
        return "/images/" + numeroStr + "_" + naipe.name() + ".png"; // O caminho pode ser ajustado conforme o nome do diretório e o padrão de nome dos arquivos de imagem
    }
}
