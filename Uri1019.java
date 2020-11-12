import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int N, horas, min, seg, resto;
                
        N = teclado.nextInt(); 
       
        horas = N / 3600;
        resto = N % 3600;

        min = resto / 60;
        seg = resto % 60;
                       
        System.out.println(horas+":"+min+":"+seg);
    }
}