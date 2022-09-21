// Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente-o de 1000 em 1000,
// imprimindo seu valor na tela, ate que seu valor seja 100000 (cem mil).

public class lista4 {
    public static void main(String[] args) {
        int num=0,inc=1000;
        while(num<=100000){
            System.out.println(num);
            inc = inc+1000;
            num= num + 1000;
        }
    }
}
