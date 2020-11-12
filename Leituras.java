import java.util.Scanner; // declaro a importacao da biblioteca
/*
exemplo de leitura de dados via teclado
Detalhe: o Scanner utiliza como o idioma padrao, o idioma da maquina. Isto significa por exemplo, ao usuario
um numro real (double, float)
*/
public class Leituras{
    public static void main(String args[]){

        // preciso criar o componente
        Scanner teclado;
        teclado = new Scanner(System.in); // crio o componente apontando-o para
                                          // o dispositivo de entrada padrao (teclado)
        int valorInteiro;
        float valorReal;
        System.out.println("Por favor, digite um numero inteiro");
        valorInteiro = teclado.nextInt();
        System.out.println("O valor inteiro " + valorInteiro + " foi digitado");

        System.out.println("Agora digite o valor real");
        valorReal = teclado.nextFloat();
        System.out.println("O valor real digitado vale "+valorReal);
        System.out.printf("O valor com 2 casas decimais: %.2f\n",valorReal);
    }
}