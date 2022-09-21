// Fac¸a um programa que leia um numero inteiro N e depois imprima os N primeiros n ´ umeros naturais ´
// ´ımpares.
import java.util.*;
public class lista9 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i=0,num,cont;
    System.out.println("Valor para num: ");
    num = sc.nextInt();
    cont = num;
        if(num!=0){
            if(num %2 !=0){
                while(i<cont){
                    num+=2;
                    System.out.println(num);
                    i++;
                }
              }    
      }
    sc.close();
   } 
}
