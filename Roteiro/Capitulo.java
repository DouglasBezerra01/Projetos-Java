package Roteiro;

import java.util.Scanner;
import java.util.ArrayList;

public class Capitulo {
    private String roteiro;
    private ArrayList<Escolha> escolhas;
    private Personagem PjPrincipal;
    private Scanner leitor;
    private int gasto = 0;

    public void setGasto(int gasto) {
        this.gasto = gasto;
    }

    public void setRoteiro(String roteiro) {
        this.roteiro = roteiro; // Receber o roteiro
    }

    public Capitulo(Scanner l, Personagem p){ // Objeto construtor que recebe o numero de escolhas como parametro
        this.escolhas = new ArrayList<Escolha>();
        this.PjPrincipal = p;
        this.leitor = l;
    }

    public void executa(){
        this.mostrar();
        if (this.escolhas.size() > 0){
            int resposta = this.escolha();
            this.escolhas.get(resposta).next();
        }
    }
    
    private void mostrar() {
        System.out.println(roteiro.replace("&", "\n").replace("jogador.getNome()", PjPrincipal.getNome())); // Mostrar o roteiro

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
        int max = escolhas.size();

        do {
            alt = leitor.nextInt();

            if (alt >= max || alt<0) {
                System.out.println("Opção inválida. Tente novamente.");
            }
            leitor.nextLine();
        } while (alt >= max || alt<0);
        return alt;
    }

    public void addEscolha(Escolha e){ 
        this.escolhas.add(e); // Adciona a escolha à lista de escolha
    }

    public void addEscolha(String texto, Capitulo cap){ // Adciona a escolha à lista de escolha
        this.escolhas.add(new Escolha(texto, cap));
    }
}
