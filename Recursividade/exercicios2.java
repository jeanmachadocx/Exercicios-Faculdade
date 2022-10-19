// Fac¸a uma func¸ao recursiva que calcule e retorne o fatorial de um n ˜ umero inteiro N. 
import java.util.*;
public class exercicios2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Digite um número");
        x = sc.nextInt();
        System.out.println(fatorial(5));
        sc.close();
    }

    static int fatorial(int x){
        if(x==0){
        return 1;
        }
        return x * fatorial(x-1);
    }
}
