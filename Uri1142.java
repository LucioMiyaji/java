/* Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas de saída que serão apresentadas 
na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.

*/
import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int n;
        int cont = 1;
        n = teclado.nextInt();
                                       
        do{
            if (cont %4 != 0){
                System.out.print(cont+" ");
            }
            else {
                System.out.println("PUM");
            }
            cont++;
        } while (cont <= 4 * n);
    }   
}