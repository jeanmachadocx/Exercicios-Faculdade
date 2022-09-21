// 5. Fac¸a um programa que pec¸a ao usuario para digitar 10 valores e some-os. ´
import java.util.*;
public class lista5 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int cont=0; float num,soma=0;
  
   while(cont <10){
        System.out.println("Digite um número");
      num = sc.nextFloat();
      soma = soma + num;
      cont++;
   }
System.out.println("O resultado da soma é: " + soma);
sc.close();   
} 
}
