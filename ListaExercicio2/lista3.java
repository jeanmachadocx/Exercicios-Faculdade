// 3. Fac¸a um programa para verificar se um determinado numero inteiro e divis´ıvel por 3 ou 5, mas nao˜
// simultaneamente pelos dois.

import java.util.*;
public class lista3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float num;
        System.out.println("Informe um número: ");
        num = sc.nextFloat();
        if(num % 3==0){
            System.out.println(num + " é dívisel por 3");
        }else if(num % 5==0){
            System.out.println(num + " é dívisel por 5");
        }else{
            System.out.println(num + " não é dívisel por 3 e nem por 5");
        }
        sc.close();
    }
}
