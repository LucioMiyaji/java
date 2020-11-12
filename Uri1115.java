/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. 
Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas 
coordenadas for NULA (nesta situação sem escrever mensagem alguma).

Entrada
A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.

Saída
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.
*/
import java.util.Scanner;
public class Uri1115{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X, Y;
                       
        do{
            X = teclado.nextInt();
            Y = teclado.nextInt();
            if (X > 0 && Y > 0){
                System.out.println("primeiro");
            }
            else if (X < 0 && Y > 0){
                System.out.println("segundo");
            }
            else if(X < 0 && Y < 0){
                System.out.println("terceiro");
            }
            else if(X >0 && Y < 0){
                System.out.println("quarto"); 
            }
        } while (X !=0 && Y !=0);
    }   
}