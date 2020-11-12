/* Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos 
(desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.
*/
import java.util.Scanner;
public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float numero;
        int qtdePositivos=0;

        // como conto até 6                
        for (int cont=1; cont<=6; cont++){
            numero = teclado.nextFloat();
            if (numero > 0){
                // System.out.println("Voce digitou um nro positivo");
                qtdePositivos++;
            }
        }
        System.out.println(qtdePositivos+" valores positivos");
   }
}