/* 
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
A seguir, calcule e mostre o valor da conta a pagar.
*/
import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
// variaveis de entrada
        int COD, QTD;
        COD = teclado.nextInt();
        QTD = teclado.nextInt();
        double total;

        if COD == 1{
            total = QTD * 4.00;
        }
        else if


        }

            total = QTD * 4.50;
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }
    }
}