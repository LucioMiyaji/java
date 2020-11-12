/*
Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: MUITO OBRIGADO e a quantidade de clientes que abasteceram cada tipo de combustível, 
conforme exemplo.
*/
import java.util.Scanner;
public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;
        int A = 0;
        int G = 0;
        int D = 0;
                       
        do{
            X = teclado.nextInt();
                        
            if (X == 1){
                A++;
            }
            else if (X == 2){
                G++;
            }    
            else if(X == 3){
                D++;
            }
        } while (X != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+A);
        System.out.println("Gasolina: "+G);
        System.out.println("Diesel: "+D);
    }   
}