package Roteiro;

import java.util.Scanner;

public class Capitulo {
    String roteiro;
    String[] escolhas;
    int gasto = 0;

    public Capitulo(int escolha){ // Objeto construtor que recebe o numero de escolhas como parametro
        escolhas = new String[escolha];
    }

    public void mostrar(Personagem a) {
        System.out.println(roteiro);

        int contador = 0;
        for (String str : escolhas){
            System.out.println("[" + contador + "] "+ str);
            contador++;
        }

        if (gasto != 0) {
            a.gastarEnergia(gasto);

        }
    }

    public int escolha(Scanner leitor) {
        int alt; // Método para repetir a pergunta em caso resposta inválida
        int max = escolhas.length;

        do {
            alt = leitor.nextInt();

            if (alt >= max || alt<0) {
                System.out.println("Opção inválida. Tente novamente.");
            }
            leitor.nextLine();
        } while (alt >= max || alt<0);
        return alt;
    }
}
