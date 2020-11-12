import java.util.Scanner;
public class TestDoWhile{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
// ENTRADA
        int valor;
        valor = tecladoo.nextInt();
        do{
            System.out.println("Valor = "+valor);
            valor++; // valor = valor + 1;
            // equivale também a valor += 5 --> valor = valor + 5;
          } while (valor <= 10);
        System.out.println(" ***** FIM DO PROGRAMA *****");
    }
}