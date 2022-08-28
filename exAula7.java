import java.util.*;
public class exAula7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Insira um número");
        num = sc.nextInt();
        if(num%2==0){
            System.out.println(num + " + 5" + num+5);
        } else{
            System.out.println(num + " + 8 " +num+8);
        }
        sc.close();
    }
}