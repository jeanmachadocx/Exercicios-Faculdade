import java.util.*;
public class exAula4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num,dobro,triplo;
        System.out.println("Digite um número");
        num = sc.nextFloat();
        if(num >= 0){
            dobro = num*2;
            System.out.println("O dobro do número informado é " + dobro);
        } else{
            triplo = num*3;
            System.out.println("O triplo do número é " + triplo);
        }
        sc.close();
    }
}
