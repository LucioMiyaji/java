/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo 
pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.
*/
import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
// variaveis de entrada
        int HI, HF, TEMPO;
        HI = teclado.nextInt();
        HF = teclado.nextInt();

        TEMPO = HF - HI;
        
        if (TEMPO <= 0){
            TEMPO = TEMPO + 24;
        }
            System.out.println("O JOGO DUROU "+TEMPO+" HORA(S)");
    }
}