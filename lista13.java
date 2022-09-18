// 13. A nota final de um estudante e calculada a partir de trˆes notas atribu´ıdas entre o intervalo de 0 ate 10,
// respectivamente, a um trabalho de laboratorio, a uma avalia ´ c¸ao semestral e a um exame final. A media ˜
// das trˆes notas mencionadas anteriormente obedece aos pesos: Trabalho de laboratorio: 2; Avalia ´ c¸ao˜
// Semestral: 3; Exame Final: 5. De acordo com o resultado, mostre na tela se o aluno esta reprovado
// (m´edia entre 0 e 2,9), de recuperac¸ao (entre 3 e 4,9) ou se foi aprovado. Fa ˜ c¸a todas as verificac¸oes ˜
// necessarias

import java.util.*;
public class lista13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double trabalho,avaliacao,exame,media;
        System.out.println("Digite a nota do trabalho em laboratório: ");
        trabalho = sc.nextDouble();
        System.out.println("Nota da avaliação semestral:");
        avaliacao = sc.nextDouble();
        System.out.println("Nota exame final:");
        exame = sc.nextDouble();
        media = ((trabalho * 2)+(avaliacao * 3)+(exame * 5))/10;
        System.out.println("Média ponderada: " + media);
        if((media <=0)&&(media <=2.9)){
            System.out.println(" Reprovado");
        }else  if((media >=3)&&(media <=4.9)){
            System.out.println(" Recuperação");
        }else if(media >5){
            System.out.println("Aprovado, parabéns");
        }else{
            System.out.println("Informe valores válidos!");
        }
        sc.close();
    }
}
