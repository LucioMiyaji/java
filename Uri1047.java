/* Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. 
A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: O JOGO DUROU XXX HORA(S) E YYY MINUTO(S).
*/
import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

// ENTRADA
        int HI, MI, HF, MF, TEMPO, HR, MR;
        HI = teclado.nextInt();
        MI = teclado.nextInt();
        HF = teclado.nextInt();
        MF = teclado.nextInt();

// PROCESSAMENTO
        TEMPO = (HF * 60 + MF) - (HI * 60 + MI);
        
        if (TEMPO <= 0){
            TEMPO = TEMPO + 24 * 60;
        }
        HR = TEMPO / 60;
        MR = TEMPO % 60;

// SAIDA
        System.out.println("O JOGO DUROU "+HR+" HORA(S) E "+MR+" MINUTO(S)");
    }
}