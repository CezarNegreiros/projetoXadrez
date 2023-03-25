package application;

import tabuleiroJogo.Posicao;
import tabuleiroJogo.Tabuleiro;
import xadrez.PartidaXadrez;
import xadrez.PecaXadrez;
import xadrez.PosicaoXadrez;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        PartidaXadrez partida = new PartidaXadrez();

        while(true){
            UserInterface.imprimirTabuleiro(partida.getPecas());
            System.out.println();
            System.out.print("Origem: ");
            PosicaoXadrez origem = UserInterface.escrevaPosicaoXadrez(leitor);

            System.out.println();
            System.out.print("Destino: ");
            PosicaoXadrez destino = UserInterface.escrevaPosicaoXadrez(leitor);

            PecaXadrez pecaCapturada = partida.movimentoXadrez(origem, destino);
        }
    }
}
