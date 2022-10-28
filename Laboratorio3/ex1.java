// 1. Fac¸a um programa que possua um vetor denominado A que armazene 6 numeros inteiros. O programa ´
// deve executar os seguintes passos:
// • Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
// • Armazene em uma variavel inteira (simples) a soma entre os valores das posi ´ c¸oes A[0], A[1] e A[5] ˜
// do vetor e mostre na tela esta soma.
// • Modifique o vetor na posic¸ao 4, atribuindo a esta posic¸ ˜ ao o valor 100. ˜
// • Mostre na tela cada valor do vetor A, um em cada linha.


public class ex1 {
    public static void main(String[] args) {
        int []vetA = new int[6]; int soma;
        vetA[0]= 1;  vetA[1]=0;  vetA[2]=5; vetA[3]=-2;
        vetA[4]= 100; vetA[5]=7;
        soma = vetA[0] + vetA[1] + vetA[5];
       System.out.println("A soma é: " + soma);
        System.out.println(vetA[0]);
        System.out.println(vetA[1]);
        System.out.println(vetA[2]);
        System.out.println(vetA[3]);
        System.out.println(vetA[4]);
        System.out.println(vetA[5]);
    }
}
