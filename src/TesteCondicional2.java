import java.util.Scanner;

public class TesteCondicional2 {



    public void main(String[] args){
        System.out.println("=====================");
        System.out.println("    Festa Mágica");
        System.out.println("=====================");
        Scanner pergunta = new Scanner(System.in);
        System.out.print("--> Quantos anos você tem? ");
        int idade = pergunta.nextInt();
        System.out.println("======================");
        Scanner quantidadePessoas = new Scanner(System.in);
        System.out.println("--> Quantas pessoas vem com você? ");
        int pessoas = quantidadePessoas.nextInt();
        boolean acompanhado = pessoas >= 2;
        if(idade >= 18 && acompanhado) {
            System.out.println("--> Bem vindo ao Reggae!! yeahhhhh");
        }else{
            System.out.println("--> Você é muito novo e está mal acompanhado(a).");
        }

    }
}
