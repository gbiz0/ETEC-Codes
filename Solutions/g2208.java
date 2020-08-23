import java.lang.Math;
import java.util.Scanner;
public class g2208{
 
    public static void main(String[] args) {

         Scanner ler = new Scanner(System.in);
         System.out.println("Escreva o número de bolas vermelhas");
         int verm = ler.nextInt();

         System.out.println("Escreva o número de bolas verdes");
         int verd = ler.nextInt();

         System.out.println("Escreva o número de bolas azuis");
         int azu = ler.nextInt();

         System.out.println("Escreva o número de bolas amarelas");
         int amar = ler.nextInt();

         System.out.println("Escreva o número de bolas brancas");
         int bran = ler.nextInt();

         int min =  Math.min(verm, verd);
             min =  Math.min(azu, min);
             min =  Math.min(amar, min);
             min =  Math.min(bran, min);
            
        int resultado = ((verm + verd + azu + amar + bran)-min) ;
            
        System.out.println("O valor minimo é: "+ resultado);


    }
}