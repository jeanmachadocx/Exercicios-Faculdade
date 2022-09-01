import java.util.*;
public class exAula1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,soma;
        System.out.println("Digite um valor para A ");
        a = sc.nextDouble();
        System.out.println("Digite um valor para B ");
        b = sc.nextDouble();
        System.out.println("Digite um valor para C");
        c = sc.nextDouble();
        soma = a+b;
        if(soma <c){
            System.out.println(soma + " < " + c );
        }else{
            System.out.println(soma + ">" + c);
        }

        sc.close();
    }
}
