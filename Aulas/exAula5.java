import java.util.*;
public class exAula5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a,b;
        System.out.println("Defina true or false para o valor A");
        a = sc.nextBoolean();
        System.out.println("Defina true or false para o valor B");
        b = sc.nextBoolean();
        if(a == true && b == true){
            System.out.println(" VERDADEIROS");
        } else if (a == false && b == false) {
           System.out.println("FALSO");
        }
sc.close();
    }
}
