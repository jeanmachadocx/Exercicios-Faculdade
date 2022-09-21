// Fac ̧a um programa que determine o mostre os cinco primeiros m ́ultiplos de 3, considerando n ́umeros
// maiores que 0.

public class lista1{
public static void main(String[] args) {
    int num=1, cont=0;
        while(cont <5){
            if(num%3==0){
                System.out.println(num);
                cont++;
            }
            num++;
        }
}
}
