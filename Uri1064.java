/* Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se 
mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.
*/
import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float numero;
        float somatoria = 0;
        float media;
        int qtdePositivos = 0;

        // sei contar até 6?             
        for (int cont=1; cont<=6; cont++){
            numero = teclado.nextFloat();
            if (numero > 0){
                qtdePositivos++;
                somatoria = somatoria + numero;
            }
        }
        media = somatoria / qtdePositivos;

        System.out.println(qtdePositivos+" valores positivos");
        System.out.printf("%.1f\n", media);
   }
}