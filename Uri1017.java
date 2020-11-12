import java.util.Scanner;
public class Uri1017{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int TH,VM,D;
        double L;
        
        TH = teclado.nextInt(); 
        VM = teclado.nextInt();

        D = VM * TH;

        L = D / 12.0;

               
        System.out.printf("%.3f\n",L);
    }
}