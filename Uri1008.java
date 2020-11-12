import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int F,H;
        double V,S;
        
        F = teclado.nextInt();
        H = teclado.nextInt();
        V = teclado.nextDouble();
    
        S = H * V;

        System.out.println("NUMBER = "+F);
        System.out.printf("SALARY = U$ %.2f\n",S);
    }
}