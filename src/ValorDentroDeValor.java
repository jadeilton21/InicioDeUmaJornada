public class ValorDentroDeValor {


    public static void main(String[] args) {
        // Guardando variavel dentro de variavel.

        int primeiro = 5;
        int segundo = 7;
        primeiro = segundo;
        System.out.println(primeiro);

        // Se a variavel vim depois, não conta.

        int primeiro1 = 6;
        int segundo1 = 7;
        primeiro1 = segundo1;
        System.out.println(primeiro1);
        // a variavel que vai ser puxada é a de cima, o java compila de cima para baixo.
        primeiro1 = 10;

        String saudacao = "Olá, meu nome é ";
        String nome = "Rômulo ";
        String continuacao = "e minha idade é ";
        int idade = 100;
        System.out.println(saudacao+nome+continuacao+idade);




        String meuNome = " Meu nome é ";
        String jadeilton = "Jaeilton,";
        String tenho = " Tenho ";
        String anos = " anos e curso programação na Alura.";
        int idade1 = 22;
        System.out.println(meuNome+jadeilton+tenho+idade1+anos);



        String jade = " fayaaa! ";
        String faya = " Jadeeeeee " ;
        String maconha = " Doidera ";
        String queroBuceta = " Quero uma buceta bem gostosa para ";
        String gozarDentro = " Para da uma gozada em cima,";
        String aquiE = " Aqui é, ";
        String fogo = " e eu taco muito fogooooo... ";
        System.out.println(queroBuceta+gozarDentro+maconha+aquiE+faya+fogo+jade);



    }
}

