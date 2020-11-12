/* A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice 
reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, 
conforme exemplo abaixo.
*/
import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
// variaveis de entrada
        double salario,nsal,reajuste;
        salario = teclado.nextDouble();
        
        if (salario >= 0 && salario <= 400.00){ 
            reajuste = (salario * 0.15);
            nsal = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n",nsal);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 15 %");
        }
        else if (salario >= 400.01 && salario <= 800.00){ 
            reajuste = salario * 0.12;
            nsal = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n",nsal);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 12 %");
        }
        else if (salario >= 800.01 && salario <= 1200.00){ 
            reajuste = salario * 0.10;
            nsal = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n",nsal);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 10 %");
        }
        else if (salario >= 1200.01 && salario <= 2000.00){ 
            reajuste = salario * 0.07;
            nsal = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n",nsal);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 7 %");
        }
        else if (salario > 2000.00){
            reajuste = salario * 0.04;
            nsal = salario + reajuste;
            System.out.printf("Novo salario: %.2f\n",nsal);
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);
            System.out.println("Em percentual: 4 %");
        }   
    }
}