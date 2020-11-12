import java.util.Scanner;
public class Uri1051{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
// variaveis de entrada
        double salario

        salario = teclado.nextDouble();

        
        MI = teclado.nextInt();
        HF = teclado.nextInt();
        MI = teclado.nextInt();

        TEMPO = (HF * 60 + MF) - (HI * 60 + MI);
        
        if (TEMPO <= 0){
            TEMPO = TEMPO + 24 * 60;
        }
            System.out.println("O JOGO DUROU "+TEMPO+" HORA(S)");
    }
}