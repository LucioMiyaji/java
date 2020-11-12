/* Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido, 
mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou 
negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), pois por 
definição zero é par, seu programa deverá imprimir apenas NULL.

Entrada
A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. Cada caso de 
teste a seguir é um valor inteiro X (-10**7 < X <10**7).

Saída
Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras deverão ser 
maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.
*/
import java.util.Scanner;
public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int qtd;
        int num;
                
        qtd = teclado.nextInt();
        
        for (int cont=1; cont<=qtd; cont++){
            num = teclado.nextInt();
            if (num == 0){
            System.out.println("NULL");
            }
            else if (num %2 == 0 && num > 0){
                System.out.println("EVEN POSITIVE");
            }
            else if (num %2 == 0 && num < 0){
                System.out.println("EVEN NEGATIVE");
            }
            else if (num %2 != 0 && num > 0){
                System.out.println("ODD POSITIVE");
            }
            else {
                System.out.println("ODD NEGATIVE");
            }
        }            
    }   
}