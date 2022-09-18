// 4. Dados trˆes valores, A, B, C, verificar s eles podem ser valores dos lados de um triangulo e, se forem, se ´e
// um triangulo escaleno, equilatero ou isoscele, considerando os seguintes conceitos: ´
// • O comprimento de cada lado de um triangulo ˆ ´e menor do que a soma dos outros dois lados.
// • Chama-se equilatero o tri ´ angulo que tem tr ˆ ˆes lados iguais.
// • Denominam-se isosceles o tri ´ angulo que tem o comprimento de dois lados iguais. ˆ
// • Recebe o nome de escaleno o triangulo que tem os tr ˆ ˆes lados diferentes.

import java.util.*;
public class lista4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float ladoA=1, ladoB=1, ladoC=1;
        System.out.println("Digite um valor para o Lado A");
        ladoA = sc.nextFloat();
        System.out.println("Digite um valor para o Lado B");
        ladoB = sc.nextFloat();
        System.out.println("Digite um valor para o Lado C");
        ladoC = sc.nextFloat();
        
        while((ladoA >0)&&(ladoB >0)&&(ladoC >0)){
            if((ladoA == ladoB)&&(ladoB==ladoC)&&(ladoA ==ladoC)){
                    System.out.println("Triângulo equilatero");
            }else if((ladoA == ladoB)&&(ladoB!= ladoC)&&(ladoC != ladoA)){
                    System.out.println("Triângulo isosceles"); 
            } else if((ladoA == ladoC)&&(ladoB!= ladoC)&&(ladoB!= ladoA)){
                    System.out.println("Triângulo isosceles");
            } else if((ladoB == ladoC)&&(ladoB!= ladoA)&&(ladoC!= ladoA)){
                    System.out.println("Triângulo isosceles");
            } else if((ladoA != ladoB)&&(ladoB != ladoC)&&(ladoC != ladoA)){
                    System.out.println("Triangulo escaleno");
            }else{
                    System.out.println("Digite valores válidos");
                 }
          break;
        } 
        sc.close();
    }
}
