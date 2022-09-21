// Fac¸a um programa que calcule e mostre a soma dos 50 primeiros numeros pares.
public class lista10 {
    public static void main(String[] args) {
        int i, soma=0;
        for(i=0;i<50;i++){
               System.out.println(i);
                soma+=2;
                i++;  
        }
        System.out.println("soma = " +soma);
        
    }
}
