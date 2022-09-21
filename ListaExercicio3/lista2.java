// 2. Escreva um programa que escreva na tela, de 1 ate 100, de 1 em 1, 3 vezes. A primeira vez deve usar a
// estrutura de repetic ̧ ̃ao for, a segunda while, e a terceira do while.
public class lista2 {
    public static void main(String[] args) {
        int num=1,i;
        System.out.println("For");
        for(i=0;i<200;i++){
            System.out.println(num);
           num++;
           i++;
        }
        System.out.println("Usando While:");
        //Resetar variaveis   
        i=i*0;
            num = num*0;
        while(i<=100){
            System.out.println(num);
            num++;
            i++;
        }
        System.out.println("Usando Do While:");

        //Resetar variaveis   
        i=i*0;
        num = num*0;
        do {
            System.out.println(num);
            num++;
            i++;
 
        } while (i<=100);


    }
}
