//19. Leia o salario de um funcionario. Calcule e imprima o valor do novo sal ´ ario, sabendo que ele recebeu um ´
//aumento de 25%


package listaExercicio;
import java.util.*;
public class lista19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double salario, aumento,salarioFinal;
    System.out.println("Qual o seu salário atual?");
    salario = sc.nextDouble();
    aumento = (salario * 25)/100;
    System.out.println("Parabéns você acaba de receber um aumento de 25%");
    salarioFinal = salario + aumento;
    System.out.println("O seu sálario agora é: R$ " + salarioFinal );
    sc.close();
  }  
}
