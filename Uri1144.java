/* Escreva um programa que leia um valor inteiro N. N * 2 linhas de saída serão apresentadas na execução do programa, 
seguindo a lógica do exemplo abaixo. Para valores com mais de 6 dígitos, todos os dígitos devem ser apresentados.

Entrada
O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

Saída
Imprima a saída conforme o exemplo fornecido.
*/
import java.util.Scanner;
public class Uri1144{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int n, quad, cub;
        int cont = 1;
        
        n = teclado.nextInt();
                                       
        do{
            quad = cont * cont;
            cub = quad * cont;
            System.out.println(cont+" "+quad+" "+cub);
            System.out.println(cont+" "+(quad+1)+" "+(cub+1));
            cont++;
        } while (cont <= n);
    }   
}