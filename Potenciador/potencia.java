package Potenciador;

import java.util.Scanner;

public class potencia {
    public static int multiplicador(int num1, int num2) {
        //enquanto a variavel i for menor que o segundo numero,
        //o codigo continua, assim, criando um multiplicador
        int resultado = 0;
        int i = 0;

        while (i < num2) {
            resultado += num1;
            i++;
        }
        return resultado;
    }

    public static int calcPotencia(int valN, int valP) {
        //P para expoente e N para base, calculo dos casos especiais
        if (valP == 1) {
            return valN;
        } else if (valP == 0) {
            return 1;
        } else if (valP < 0) {
            return 1 / calcPotencia(valN, -valP);
        } else {
            int resultado = valN;
            int i = 1;

            while (i < valP) {
                resultado = multiplicador(resultado, valN);
                i++;
            }
            return resultado;
        }
    }

    public static void main(String[] args) {
        //extrair os numeros dados pelo usuario
        Scanner leitor = new Scanner(System.in);

        System.out.println("Valor da base:");
        System.out.print("- ");
        int valN = leitor.nextInt();

        System.out.println("Valor do expoente:");
        System.out.print("- ");
        int valP = leitor.nextInt();

        int resultado = calcPotencia(valN, valP);

        System.out.println("Resultado:");
        System.out.println("- " + resultado);
    }
}
