//  Fazer um programa para ler 5 valores e, em seguida, mostrar a posic¸ao onde se encontram o maior e o ˜
// menor valor
import java.util.*;
public class ex13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=0,i,j,w,flag;
    int [] vetor = new int[10]; int [] iguais = new int [10];
    for(i=0;i<10;i++){
        System.out.println("Entre com o elemento: ");
        vetor[i] = sc.nextInt();
    }
    for(i=0; i<10; i++){
        for(j=0; j<10; j++){
            flag=0;
            if(vetor[i]==vetor[j] && i != j){
                for(w=0; w<10; w++){
                    if(iguais[w] == vetor[j]){
                        flag=1;
                }
                if(flag==0){
                    iguais[a]=vetor[i];
                    a++;
                }
               
            }
        }
     }
     for(i=0; i<a; i++){
        System.out.println(iguais[i]);
     }
    }
}
}


