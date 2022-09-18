// Escreva um programa que, dada a idade de um nadador, classifique-o em uma das seguintes categorias:
// Categoria Idade
// Infantil A 5 a 7
// Infantil B 8 a 10
// Juvenil A 11 a 13
// Juvenil B 14 a 17
// Sˆenior maiores de 18 anos

import java.util.*;
public class lista11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Qual a idade?");
        idade = sc.nextInt();
        if((idade >5)&&(idade<7)){
            System.out.println("Sua categoria é: Infantil A");
        }else if((idade >8)&&(idade<10)){
            System.out.println("Sua categoria é: Infantil B");
        }else if((idade >11)&&(idade<13)){
            System.out.println("Sua categoria é: Juvenil A");
        }else if((idade >14)&&(idade<17)){
            System.out.println("Sua categoria é: Juvenil B");
        }else if(idade >=18){
            System.out.println("Categoria Sênior");
        }else{
            System.out.println("Não faz parte de nenhuma categoria");
        }
        sc.close();
    }
}
