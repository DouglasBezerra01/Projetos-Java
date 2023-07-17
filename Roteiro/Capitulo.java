package Roteiro;

import java.util.Scanner;
import java.util.ArrayList;

public class Capitulo {
    String roteiro;
    ArrayList<Escolha> escolhas;
    Personagem PjPrincipal;
    Scanner leitor;
    int gasto = 0;

    public Capitulo(Scanner l, Personagem p){ // Objeto construtor que recebe o numero de escolhas como parametro
        this.escolhas = new ArrayList<Escolha>();
        this.PjPrincipal = p;
        this.leitor = l;
    }

    public void executa(){
        this.mostrar();
        if (this.escolha.size() > 0){
            int resposta = this.escolha();
            this.escolhas.get(resposta).next();
        }
    }
    
    private void mostrar() {
        System.out.println(roteiro);

        int contador = 0;
        for (Escolha esc : escolhas){
            System.out.println("[" + contador + "] "+ esc.get_texto());
            contador++;
        }

        if (gasto != 0) {
            PjPrincipal.gastarEnergia(gasto);

        }
    }

    private int escolha() {
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
