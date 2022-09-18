// 15. Leia o salario de um trabalhador e o valor da prestac¸ao de um empr ˜ ´estimo. Se a prestac¸ao for maior que ˜
// 20% do salario imprima: Empr ´ ´estimo nao concedido, caso contrario imprima: Empr ˜ ´estimo concedido.

import java.util.*;
public class lista15 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double salario, prestacao, condicao;
    System.out.println("Qual o seu salário?");
    salario = sc.nextDouble();
    System.out.println("Qual o valor da prestação?");
    prestacao = sc.nextDouble();
    condicao = ((salario * 20)/100);
    if(prestacao > condicao){
        System.out.println("Empréstimo não concedido");
    }else{
        System.out.println("Empréstimo concedido");
    }
    sc.close();
}    
}
