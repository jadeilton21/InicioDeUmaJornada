public class RestoDaDivisao {

    public static void main(String[] args){
        for(int i=0; i < 100; i++){
            if( i % 3 ==0){
                System.out.print(" ");
                System.out.print(i + ",");
                if(i == 99){
                    System.out.println(".");
                }
            }

        }

    }
}
