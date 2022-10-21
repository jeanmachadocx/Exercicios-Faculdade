import java.util.*;
public class exercicio4 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] vetA = new int[10];
    int [] vetB = new int[10];
    int produto = 0;
    for(int i=0; i<vetA.length; i++){
        System.out.println("Valores matriz A ");
        vetA[i] = sc.nextInt();
    }
    for(int i=0; i<vetB.length; i++){
        System.out.println("Valores matriz B ");
        vetB[i] = sc.nextInt();
    }
    for(int i=0; i<10; i++){
        produto = vetA[i] * vetB[i];
        System.out.println("O produto escalar é: " + produto);
    }
   
sc.close();
}    
}
