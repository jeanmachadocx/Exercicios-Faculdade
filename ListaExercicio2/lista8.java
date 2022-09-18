// 8. Fac¸a uma prova de matematica para crian ´ c¸as que estao aprendendo a somar n ˜ umeros inteiros menores ´
// do que 100. Escolha numeros aleat ´ orios entre 1 e 100, e mostre na tela a pergunta: qual e a soma de a + ´
// b, onde a e b sao os n ˜ umeros aleat ´ orios. Pe ´ c¸a a resposta. Fac¸a cinco perguntas ao aluno, e mostre para
// ele as perguntas e as respostas corretas, al´em de quantas vezes o aluno acertou.


import java.util.*;
//import java.util.random.*;
public class lista8 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int i, acerto=0, resp;
        int soma;
        
        for(i=0;i<5;i++){
            int a = rd.nextInt(100);
            int b = rd.nextInt(100);
            soma = a+b;
            System.out.println("Qual a soma de " + a + " + " + b);
                 resp = sc.nextInt();
            if(resp ==soma){
                System.out.println("Resposta correta");
                acerto++;
            }else{
            System.out.println("Resposta errada");
            }
          
        }
        System.out.println("Você acertou: " + acerto + " vezes");
        
        sc.close();  
    } 
}
