import java.util.Scanner;

public class TesteCondicional {


    public static void main(String[] args){
        Scanner informe = new Scanner(System.in);
        System.out.print("--> Me diga sua idade? ");
        int idade = informe.nextInt();
        if (idade >=18){
            System.out.println("--> Você pode entrar!! Seja bem vindo.");

        } else {
            if(idade < 18){
                System.out.println("--> Você é de menor.. Não pode entrar sozinho!");
            }
        }
        Scanner informe2 = new Scanner(System.in);
        System.out.print("--> Quantas pessoas está com você? ");
        int pessoasComigo = informe2.nextInt();
        if(pessoasComigo >= 2){
            System.out.println("--> Pode entrar, você está acompanhado com " + pessoasComigo + " pessoas!");
        }else {
            if ( pessoasComigo < 2){
                System.out.println("--> Você está sozinho, Não pode entrar.");
            }
        }




    }
}
