/* Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, 
quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.
*/
import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int qtdePares = 0;
        int qtdeImpares = 0;
        int qtdePositivos = 0;
        int qtdeNegativos = 0;

        // sei contar até 5?             
        for (int cont=1; cont<=5; cont++){
            numero = teclado.nextInt();
            if (numero % 2 == 0){
                qtdePares++;
            }
            else {qtdeImpares++;
            }
            if (numero > 0){
                qtdePositivos++;
            }
            else if (numero < 0){
                qtdeNegativos++;
            }
        }
        System.out.println(qtdePares+" valor(es) par(es)");
        System.out.println(qtdeImpares+" valor(es) impar(es)");
        System.out.println(qtdePositivos+" valor(es) positivo(s)");
        System.out.println(qtdeNegativos+" valor(es) negativo(s)");
   }
}