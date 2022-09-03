// Faca um programa que leia o valor da hora de trabalho (em reais) e numero de horas trabalhadas no 
// mes. Imprima o valor a ser pago ao funcionario, adicionando 10% sobre o valor calculado. 

package listaExercicio;
import java.util.*;
public class lista10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horasTrabalhadas, valorHoras, pagamento;
        System.out.println("Informe o valor das horas trabalhadas: ");
        valorHoras = sc.nextDouble();
        System.out.println("Quantas horas trabalhadas? ");
        horasTrabalhadas  = sc.nextDouble();
        pagamento = ((valorHoras * horasTrabalhadas) * 10/100);
        System.out.println("Valor a ser pago: " + pagamento);
        sc.close();
    }
}
