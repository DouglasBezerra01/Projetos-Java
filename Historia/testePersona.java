package Historia;

import java.util.Scanner;

import Roteiro.Personagem;

public class testePersona {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Criação do Personagem");
        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        System.out.print("Idade: ");
        int idade = leitor.nextInt();
        leitor.nextLine(); // Limpar o buffer do Scanner

        Personagem personagem = new Personagem(nome, idade);

        System.out.println("\nPersonagem criado:");
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Idade: " + personagem.getIdade());
        System.out.println("Energia: " + personagem.getEnergia());
    }

}
