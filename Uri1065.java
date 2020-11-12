/* Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
*/
import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int qtdePares = 0;

        // sei contar até 5?             
        for (int cont=1; cont<=5; cont++){
            numero = teclado.nextInt();
            if (numero % 2 == 0){
                qtdePares++;
            }
        }
        System.out.println(qtdePares+" valores pares");
   }
}