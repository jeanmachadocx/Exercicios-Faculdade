// Fac¸a um programa que leia 2 notas de um aluno, verifique se as notas sao v ˜ alidas e exiba na tela a media ´
// destas notas. Uma nota valida deve ser, obrigatoriamente, um valor entre 0.0 e 10.0, onde caso a nota ´
// nao possua um valor v ˜ alido, este fato deve ser informado ao usu ´ ario e o programa termina.

import java.util.*;
public class lista16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1,nota2,media;
    System.out.println("Valor nota 1");
        nota1 = sc.nextDouble();
        System.out.println("Valor nota 2");
        nota2= sc.nextDouble();
        media = (nota1 + nota2 )/2;
    if((nota1 >=0)&&(nota1 <=10)&&(nota2 >=0)&&(nota2 <=10)){
        System.out.println("A média é: " + media);
    }else{
        System.out.println("Informe um número válido");
    }
        sc.close();
    }
}
