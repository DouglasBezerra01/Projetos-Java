package Roteiro;

public class Personagem {
    private String nome;
    private int idade;
    private String classe;
    private int energia;

    public Personagem(String nome, int idade, String classe) {
        this.nome = nome;
        this.idade = idade;
        this.classe = classe;
        this.energia = 10;
    }

    public Personagem() {
        this.energia = 10;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return idade;
    }

    public String getClasse() {
        return classe;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void gastarEnergia(int energia) {
        this.energia -= energia;
        if (this.energia < 0)
            this.energia = 0;
    }
}
