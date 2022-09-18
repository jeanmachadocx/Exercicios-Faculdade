// // Leia uma data de nascimento de uma pessoa fornecida atrav´es de trˆes numeros inteiros: Dia, M ´ ˆes e Ano.
// Teste a validade desta data para saber se esta ´e uma data valida. Teste se o dia fornecido ´ ´e um dia valido: ´
// dia > 0, dia ≤ 28 para o mˆes de fevereiro (29 se o ano for bissexto), dia ≤ 30 em abril, junho, setembro
// e novembro, dia ≤ 31 nos outros meses. Teste a validade do mˆes: mˆes > 0 e mˆes < 13. Teste a validade
// do ano: ano ≤ ano atual (use uma constante definida com o valor igual a 2008). Imprimir: data valida ´
// ou data invalida no final da execuc¸ ´ ao do programa

// import java.util.*;
// public class lista9 {
//        public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int ano, mes,dia;
//         int anoAtual=2022;
//         System.out.println("Informe o dia de nascimento: ");
//         dia = sc.nextInt();
//         System.out.println("Informe o mês de nascimento: ");
//         mes = sc.nextInt(); 
//         System.out.println("Informe o ano de nascimento: ");
//         ano = sc.nextInt();

//         if
//        }
        
    







// int isAnoBissexto(int ano){
//     if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0))
//         return 1;
//     return 0;
// }

// int dateValidator(int dia, int mes, int ano){
//      int anoAtual = 2022;
//      int mesAtual = 9;

//     if (ano > anoAtual){
//         return 1;
//     }else if(ano == anoAtual && mes > mesAtual) return 1;

//     if (mes < 1 || mes > 12) return 1;

//     if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
//         return (dia < 1 || dia > 31) ? 1 : 0;
//     } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
//         return (dia < 1 || dia > 30) ? 1 : 0;
    
//     }
//     return 0;

// }
// }