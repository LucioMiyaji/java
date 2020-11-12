/* Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores positivos próprios
(excluindo ele mesmo) é igual ao próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6. 
Sua tarefa é escrever um programa que imprima se um determinado número é perfeito ou não.

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 20), indicando o número 
de casos de teste da entrada. Cada uma das N linhas seguintes contém um valor inteiro X (1 ≤ X ≤ 108), que pode ser 
ou não, um número perfeito.

Saída
Para cada caso de teste de entrada, imprima a mensagem X eh perfeito ou X nao eh perfeito, de acordo com a 
especificação fornecida.
*/
import java.util.Scanner;
public class Uri1164{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int n, num, somadiv;                
        n = teclado.nextInt();

        for (int cont=1; cont<=n; cont++){
            num = teclado.nextInt();
            somadiv = 0;
            for(int div=1; div < num; div++){
                    if(num %div == 0){
                        somadiv = somadiv + div;
                    }
            }
            if (somadiv == num){
                System.out.println(num+" eh perfeito");
            }
            else {
                System.out.println(num+" nao eh perfeito");
            }
        }            
    }   
}