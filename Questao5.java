import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        String texto = scan.next();
        char[] texto1 = texto.toCharArray();
        int ultimo = texto.length() - 1;
        
        for (int i = 0; i < texto.length(); i++){
                
            texto1[i] = texto.charAt(ultimo - i);
                       
        }
        System.out.println(texto1);
        
    }
}
