//Escreva um programa Java para encontrar o número de dias em um mês.

import java.util.*;
public class diadoAno {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int mes, ano, diasMes =0;
    String nomeMes = "unknown";
    System.out.println("Digite o mês");
    mes = sc.nextInt();
    System.out.println("Digite o ano");
    ano = sc.nextInt();
   if((mes >=1)&&(mes <=12)){
    switch (mes){
        case 1:
            nomeMes = "Janeiro";
            diasMes = 31;
            break;
     }  
     switch (mes){
        case 2:
            nomeMes = "Fevereiro";
        if((ano % 4==0)&&(ano % 100 != 0)){
            diasMes = 29;
        }else{
            diasMes = 28;
        }
        break;
     }
     switch (mes){
        case 3:
        nomeMes ="Março";
        diasMes = 31;
     }
     switch (mes){
        case 3:
        nomeMes ="Abril";
        diasMes = 30;
     }
     switch (mes){
        case 3:
        nomeMes ="Maio";
        diasMes = 31;
     }
     switch (mes){
        case 3:
        nomeMes ="Junho";
        diasMes = 30;
     }
     switch (mes){
        case 3:
        nomeMes ="Julho";
        diasMes = 31;
     }
     switch (mes){
        case 3:
        nomeMes ="Agosto";
        diasMes = 31;
     }
     switch (mes){
        case 3:
        nomeMes ="Setembro";
        diasMes = 30;
     }
     switch (mes){
        case 3:
        nomeMes ="Outubro";
        diasMes = 31;
     }
     switch (mes){
        case 3:
        nomeMes ="Novembro";
        diasMes = 30;
     }
     switch (mes){
        case 3:
        nomeMes ="Março";
        diasMes = 31;
        break;
     }
     System.out.println("O mês de " + nomeMes + " do ano de " + ano + " têm " + diasMes + " dias" );
    
    }else{
        System.out.println("Escreva um mês entre 1 e 12");
    }sc.close();
  }
}


