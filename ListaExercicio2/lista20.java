// 20. Fac¸a um algoritmo que calcule o IMC de uma pessoa e mostre sua classificac¸ao de acordo com a tabela ˜
// abaixo:
// IMC Classificac¸ao˜
// < 18,5 Abaixo do Peso
// 18,6 - 24,9 Saudavel ´
// 25,0 - 29,9 Peso em excesso
// 30,0 - 34,9 Obesidade Grau I
// 35,0 - 39,9 Obesidade Grau II (severa)
// ≥ 40,0 Obesidade Grau III (morbida) 

import java.util.*;
public class lista20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double imc,peso,altura;
        System.out.println("Qual a sua altura");
        altura = sc.nextDouble();
        System.out.println("Qual o seu peso");
        peso = sc.nextDouble();
        imc = (peso /(altura *altura));
        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if((imc >=18.6 )&&(imc <=24.9)){
            System.out.println("Saúdavel");
        }else if((imc >=25 )&&(imc <=29.9)){
            System.out.println("Peso em excesso");
        }else if((imc >=30 )&&(imc <=34.9)){
            System.out.println("Obesidade Grau I");
        }else if((imc >=35 )&&(imc <=39.9)){
            System.out.println("Obesidade Grau II (severa)");
        }else if(imc >= 40){
            System.out.println("Obesidade Grau III (mórbida");
        }
        sc.close();
    }
}
