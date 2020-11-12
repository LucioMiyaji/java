import java.util.Scanner;
public class Uri1005{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double A,B,SOMA,M;
        
        A = teclado.nextDouble();
        B = teclado.nextDouble();

        SOMA = A*3.5 + B*7.5;

        M = SOMA/11.0;

        System.out.printf("MEDIA = %.5f\n",M);
    }
}