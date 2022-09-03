// Receba o salario-base de um funcionario. Calcule e imprima o salario a receber, sabendo-se que esse 
// funcionario tem uma gratificacao de 5% sobre o salario-base. Alem disso, ele paga 7% de imposto sobre
// o salario-base

package listaExercicio;
import java.util.*;
public class lista11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double salarioBase, imposto, gratificacao, salarioFinal;
       System.out.println("Qual o salário base a receber: ");
       salarioBase = sc.nextDouble();
       gratificacao = salarioBase * 5/100;
        imposto = salarioBase * 7/100;
        salarioFinal = salarioBase + gratificacao - imposto;
        System.out.println("Receberá: " +  salarioFinal);
        sc.close();
    }
}
