package Roteiro;

import java.util.Scanner;

public class Capitulo {
    String roteiro;
    String escolha1;
    String escolha2;
    int gasto = 0;

    public void mostrar(Personagem a) {
        System.out.println(roteiro);
        System.out.println("[1] " + escolha1);
        System.out.println("[2] " + escolha2);
        if (gasto != 0) {
            a.gastarEnergia(gasto);

        }
    }

    public int escolha(Scanner leitor) {
        int alt; // método para repetir a pergunta em caso resposta inválida

        do {
            alt = leitor.nextInt();

            if (alt != 1 && alt != 2) {
                System.out.println("Tente novamente. Lembre-se, apenas [ 1 ] ou [ 2 ].");
            }
            leitor.nextLine();
        } while (alt != 1 && alt != 2);
        return alt;
    }

}
