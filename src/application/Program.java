package application;

import tabuleiroJogo.Posicao;
import tabuleiroJogo.Tabuleiro;
import xadrez.PartidaXadrez;

public class Program {
    public static void main(String[] args) {

        PartidaXadrez partida = new PartidaXadrez();
        UserInterface.imprimirTabuleiro(partida.getPecas());

    }
}
