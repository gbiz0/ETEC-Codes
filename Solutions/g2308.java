    import java.util.Scanner;
public class g2308{
 
    public static void main(String[] args) {

         Scanner ler = new Scanner(System.in);
         
         int first = ler.nextInt();

         int wallet = ler.nextInt();

         int bananas = ler.nextInt();

         int value =(bananas*(first +(bananas * first)))/ 2;

         if(value>wallet){
         System.out.println(value - wallet);
         }
         else{
         System.out.println(0);
         }
         
}
}