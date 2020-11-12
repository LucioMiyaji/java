/* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem 
 Fora de intervalo.
O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

Entrada
O arquivo de entrada contém um número com ponto flutuante qualquer.

Saída
A saída deve ser uma mensagem conforme exemplo abaixo.
*/
import java.util.Scanner;
public class Uri1037{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
// variaveis de entrada
        float num;
        num = teclado.nextFloat();
        
        if (num >= 0 && num <= 25.0f){ 
            System.out.println("Intervalo [0,25]");
        }
        else if (num > 25.0f && num <= 50.0f){ 
            System.out.println("Intervalo (25,50]");
        }
        else if (num > 50.0f && num <= 75.0f){ 
            System.out.println("Intervalo (50,75]");
        }
        else if (num > 75.0f && num <= 100.0f){ 
            System.out.println("Intervalo (75,100]");
        }
        else 
            System.out.println("Fora de intervalo");
        
    }
}