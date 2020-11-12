import java.util.Scanner;
public class Uri1010{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int C1,N1,C2,N2;
        double V1,V2,TOT;
        
        C1 = teclado.nextInt(); N1 = teclado.nextInt(); V1 = teclado.nextDouble();

        C2 = teclado.nextInt(); N2 = teclado.nextInt(); V2 = teclado.nextDouble();

        TOT = (N1 * V1) + (N2 * V2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",TOT);
    }
}