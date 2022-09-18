// 19. O custo ao consumidor de um carro novo e a soma do custo de fabrica, da comiss ´ ao do distribuidor, e ˜
// dos impostos. A comissao e os impostos s ˜ ao calculados sobre o custo de fabrica, de acordo com a tabela ˜
// abaixo. Leia o custo de fabrica e escreva o custo ao consumidor. ´
// Custo de Fabrica ´ % do distribuidor dos impostos
// at´e R$ 12.0000 5 Isento
// entre R$ 12.000 e 25.0000 10 15
// acima de R$ 25.000 15 20

import java.util.*;
public class lista19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double custo,valorFinal;
    double dist, impostos;
    System.out.println("Informe o valor do carro:");
    custo = sc.nextDouble();
    if(custo >12000){
        dist = (custo * 0.5);
        valorFinal = custo + dist;
        System.out.println("Valor final do carro: R$ " + valorFinal);
    }else if((custo >= 12000)&&(custo < 25000)){
        dist = (custo * 0.10);
        impostos =  (custo * 0.10);
        valorFinal = custo + impostos + dist;
        System.out.println("Valor final do carro: R$ " + valorFinal);
    }else if(custo >=25000){
        dist = (custo * 0.15);
        impostos = custo * 0.20;
        valorFinal = custo + impostos + dist;
        System.out.println("Valor final do carro: R$ " + valorFinal);
    }
    sc.close();
  }  
}
