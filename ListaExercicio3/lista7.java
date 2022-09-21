import java.util.*;
public class lista7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0; float num,soma=0, media;
        while(cont <10){
            System.out.println("Digite um número");
          num = sc.nextFloat();
          if(num >=0){
          soma = soma + num;
          cont++;
          }
       }
       media = soma / cont;
       System.out.println("A média é: " + media);
        sc.close();
    }
}
