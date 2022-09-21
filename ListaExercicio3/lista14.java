// 14. Fac ̧a um programa que leia um n ́umero inteiro positivo par N e imprima todos os n ́umeros pares de 0 ate
// N em ordem decrescente.

import java.util.*;
public class lista14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite um valor: ");
        num = sc.nextInt();    
        do{
            if((num%2==0)&&(num >= 0)){
                num-=2;
                System.out.println(num);
                
            }else{
                System.out.println("Digite um número PAR!");
            }
        }while(num>0);
         sc.close();
        }
     }
      
  