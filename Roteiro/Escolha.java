package Roteiro;

public class Escolha {
    private String texto;
    private Capitulo proximo;

    public Escolha( String s, Capitulo c){
        this.texto = s;
        this.proximo = c;
    }

    public void next(){
        this.proximo.executa();
    }

    public String get_texto(){
        return this.texto;
    }
}
