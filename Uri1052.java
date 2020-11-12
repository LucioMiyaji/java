/* Leia um valor inteiro entre 1 e 12, inclusive. 
Correspondente a este valor, deve ser apresentado como resposta o mês do ano por extenso, em inglês, 
com a primeira letra maiúscula.

Entrada
A entrada contém um único valor inteiro.

Saída
Imprima por extenso o nome do mês correspondente ao número existente na entrada, 
com a primeira letra em maiúscula.

*/
import java.util.Scanner;
public class Uri1052{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
// ENTRADA
        int valor;
        valor = teclado.nextInt();
        
// PROCESSAMENTO - SAIDA
        if (valor == 1){ System.out.println("January");
        }
        else if (valor == 2){
            System.out.println("Feburary");
        }
        else if (valor == 3){
            System.out.println("March");
        }
        else if (valor == 4){
            System.out.println("April");
        }
        else if (valor == 5){
            System.out.println("May");
        }
        else if (valor == 6){
            System.out.println("June");
        }
        else if (valor == 7){
            System.out.println("July");
        }
        else if (valor == 8){
            System.out.println("August");
        }
        else if (valor == 9){
            System.out.println("September");
        }
        else if (valor == 10){
            System.out.println("October");
        }
        else if (valor == 11){
            System.out.println("November");
        }
        else if (valor == 12){
            System.out.println("December");
        }
    }
}