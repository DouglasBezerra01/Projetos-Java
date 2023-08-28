package Roteiro;

import java.util.Scanner;

public class Cap_imagem extends Capitulo {

    public Cap_imagem(Scanner l, Personagem p) {
        super(l, p);

    }

    private String imagem;

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void mostrar() {
        System.out.println(imagem);
        super.mostrar();
    }

}
