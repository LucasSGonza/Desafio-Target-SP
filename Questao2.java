
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        
        boolean flag = true;
        int i = 0;
        int j = 1;
        int fibonacci = 0;
        System.out.print (fibonacci + ",");
        
        for (i = 0; flag == true; fibonacci = i + j){

            fibonacci = i + j;
            i = j;
            j = fibonacci;
            System.out.print (fibonacci + ",");
            
            if (numero == 0 || numero == 1 || numero == fibonacci){                
                System.out.println ("O número " + numero + " pertence à sequência de Fibonacci!");
                flag = false;                
            } else if (numero < i + j) {
                System.out.println ("O número " + numero + " não pertence à sequência de Fibonacci!");
                flag = false;
            }
            
        }
        
        
    }
}
