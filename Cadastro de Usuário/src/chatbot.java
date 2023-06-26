import java.util.Scanner;

public class chatbot {

    public static void main(String[] args) {
        String nome;
        int idade;
        String email;
        String senha = null;
        String confirmacao = null;

        try (Scanner leitor = new Scanner(System.in)) {

            System.out.println("Olá! Estou aqui para lhe ajudar a cadastrar seu novo documento!");
            System.out.println("Para continuar, por favor, me diga o seu nome.");
            System.out.print("- ");
            nome = leitor.nextLine();
            System.out.println("");

            System.out.println("Agora, diga-me a sua idade.");
            System.out.print("- ");
            idade = Integer.parseInt(leitor.nextLine());
            System.out.println("");

            if (idade >= 18) {
                System.out.println("Você é maior de idade, pode continuar!");
                System.out.println("Agora, nos forneça um endereço de e-mail para contato.");
                email = leitor.nextLine();
                System.out.println("");

                while (senha == null || !senha.equals(confirmacao)) {

                    System.out.println("Digite uma nova senha.");
                    System.out.print("- ");
                    senha = leitor.nextLine();
                    System.out.println("");

                    System.out.println("Confirme sua senha.");
                    System.out.print("- ");
                    confirmacao = leitor.nextLine();
                    System.out.println("");

                    if (!senha.equals(confirmacao)) {
                        System.out.println("As senhas não coincidem, tente novamente.");
                        System.out.println("");
                    }
                }
                System.out.println("");
                System.out.println("Ótimo! Seu cadastro está completo!");
                System.out.println("Seus dados são:");
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("E-mail: " + email);
                System.out.println("Senha: " + senha);

            } else {
                System.out.println("Você é menor de idade, não pode continuar :(");
            }
        }
    }
}