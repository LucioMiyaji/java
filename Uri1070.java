/* Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, 
inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.
*/
import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;
                
        X = teclado.nextInt();
        if (X %2 == 0){
            X = X + 1;
        }            
        for (int cont=1; cont<=6; cont++){
            System.out.println(X);
            X = X + 2;
        }
    }
}