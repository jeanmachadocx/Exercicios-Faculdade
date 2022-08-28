import java.util.*;
public class exAula3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Defina um valor para A");
        a = sc.nextInt();
        System.out.println("Defina um valor para B");
        b = sc.nextInt();
        if(a == b){
            c = a +b;
            System.out.println("Soma de A + B " + c);
            System.out.println(c);
        }else{
            System.out.println("Multiplicação de A * B = " + a*b);
            c = a *b;
            System.out.println(c);

        }
        sc.close();


    }
}
