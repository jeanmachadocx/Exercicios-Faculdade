 //6. Escreva um programa Java para imprimir a soma, multiplicar, subtrair, dividir e o resto de dois números.

import java.util.*;
public class ex1{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num1, num2, soma, multiplicação, subtração, divisão, resto;
    System.out.println("Digite dois números");
    num1 = sc.nextDouble();
    num2 = sc.nextDouble();
    soma = num1 + num2;
    System.out.println("Soma = " +soma);
    multiplicação = num1 * num2;
    System.out.println("Multilicação = " +multiplicação );
    subtração = num1 - num2;
    System.out.println("Subtração = " +subtração);
    divisão = num1 / num2;
    System.out.println("Divisão = " +divisão);
    if(num1 > num2){
        resto = num1 % num2;
        System.out.println("Resto da divisão = " + resto);
    }else{
        System.out.println("Não é possível realizar esse cálculo (resto) ");
    }
    sc.close();
}
}
