import java.util.Scanner;
public class TestSwitch{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
// variaveis de entrada
        int valor;

        System.out.println("Por favor digite um valor");
        valor = teclado.nextInt();

        switch(valor){
            case 1:
            System.out.println("Digitou o valor 1");
            break;
            case 2:
            System.out.println("Digitou o valor 2");
            break;
            case 3:
            System.out.println("Digitou o valor 3");
            break;
            default:
            System.out.println("Digitou qualquer outro valor");
        }

    }
}