// 5. Leia a idade e o tempo de servic¸o de um trabalhador e escreva se ele pode ou nao se aposentar. As ˜
// condic¸oes para aposentadoria s ˜ ao: ˜
// • Ter pelo menos 65 anos;
// • Ou ter trabalhado pelo menos 30 anos;
// • Ou ter pelo menos 60 anos e trabalhando pelo menos 25 anos;

import java.util.*;
public class lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        float tempoServico;
        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();
        System.out.println("Informe o tempo de trabalho: ");
        tempoServico = sc.nextFloat();
        if((idade >=60)&&(tempoServico >=25)){
            System.out.println("Apto a se aposentar pelo tempo de servico e pela idade");
        }else if(idade >=65){
            System.out.println("Idade permite aposentar");
        }else if(tempoServico >= 30){
            System.out.println("Tempo de serviço necessário obtido, pode aposentar!");
        }else{
            System.out.println("Ops, não pode se aposentar ainda.");
        }
        sc.close();
    }
}
