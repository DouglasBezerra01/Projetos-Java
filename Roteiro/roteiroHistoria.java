package Roteiro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class roteiroHistoria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Personagem jogador = new Personagem();
        jogador.setNome("Fulano");
        Map <String, Capitulo> listaCapitulos = new HashMap<String, Capitulo>();


        File file = new File("Roteiro\\Recurso\\roteiro.txt"); //ler arquivo
        try {
                Scanner sc = new Scanner(file, "UTF-8");
                while (sc.hasNextLine()) {
                        String line = sc.nextLine();
                        if (line.equalsIgnoreCase("CAPITULO")){
                                String nome = sc.nextLine();
                                String roteiro = sc.nextLine();
                                int gastoEnergia = Integer.parseInt(sc.nextLine());

                                listaCapitulos.put(nome, new Capitulo(leitor, jogador)); //lista de capitulos
                                listaCapitulos.get(nome).setRoteiro(roteiro);
                                listaCapitulos.get(nome).setGasto(gastoEnergia);

                        } else if (line.equalsIgnoreCase("ESCOLHA")){ //lista de escolhas
                                String origem = sc.nextLine();
                                String escolha = sc.nextLine();
                                String destino = sc.nextLine();

                                listaCapitulos.get(origem).addEscolha(new Escolha(escolha, listaCapitulos.get(destino)));//adiciona escolha
                        }
                }
                sc.close();

        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }

        //Rodar jogo
        listaCapitulos.get("cap00").executa();
    }
}
