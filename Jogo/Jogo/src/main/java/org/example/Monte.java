package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {

    // Atributo para armazenar as cartas do monte
    private List<Carta> cartas;

    // Construtor que cria todas as cartas do baralho e adiciona na lista de cartas
    public Monte() {
        cartas = new ArrayList<>();
        // Gerar as cartas do baralho (de 1 a 13) para cada naipe
        for (Naipe naipe : Naipe.values()) {
            for (int numero = 1; numero <= 13; numero++) {
                cartas.add(new Carta(numero, naipe));
            }
        }
    }

    // Método para embaralhar as cartas
    public void embaralhar() {
        Collections.shuffle(cartas);  // Embaralha as cartas de forma aleatória
    }

    // Método para virar (remover a primeira carta e retornar ela)
    public Carta virar() {
        if (cartas.isEmpty()) {
            return null; // Retorna null caso o monte esteja vazio
        }
        return cartas.remove(0); // Remove e retorna a primeira carta
    }
}
