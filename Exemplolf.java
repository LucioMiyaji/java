import java.util.Scanner;
public class Exemplolf{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
// variaveis de entrada
        float n1, p, media;

                    
        System.out.println("Digite a nota da prova");
        n1 = teclado.nextFloat();
        System.out.println("Digite a nota da projeto");
        p = teclado.nextFloat();

        media = (n1 +p) / 2;

        System.out.println("Sua media e igual = "+media);

        if (media >= 6) {
            System.out.println("Parabens voce passou!");
        }
        else {
            System.out.println("Desta vez não deu! Até o ano que vem!");
        }
    }
}