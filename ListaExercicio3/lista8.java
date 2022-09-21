// 8. Escreva um programa que leia 10 numeros e escreva o menor valor lido e o maior valor lido.
import java.util.*;
public class lista8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, maior, menor, i;
        System.out.println("Entre o primeiro número");
        numero = sc.nextInt();
        maior = numero;
        menor = numero;
        for(i=1; i<10;i++){
            System.out.println("Entre com um número");
            numero = sc.nextInt();
            if(numero>maior){
                maior = numero;
            }else if(numero <menor){
                menor = numero;
            }
         
        }
        System.out.println("O menor número digitado foi: " + menor);
        System.out.println("O maior número digitado foi: " + maior);
        sc.close();
    }
}
