package Roteiro;

public class Personagem {
    private String nome;
    private int idade;
    private String cor;
    private String sexo;
    private int energia;
    
    public Personagem(String nome, int idade, String cor, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.sexo = sexo;
        this.energia = 10;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
