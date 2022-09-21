import java.util.*;
public class lista19 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int centena,dezena,unidade,num;
    System.out.println("Digite um número inteiro entre 100 e 999");
    num = sc.nextInt();
    centena = num/100;
    dezena = (num - centena*100)/10;
    unidade = (num - (centena *100 +dezena*10));
    if((num >100)||(num <999)){
        System.out.println(" O número: " + num );
    System.out.println(" Equivale a centana: " + centena + " dezena: " + dezena + " unidade: " + unidade );
    }else{
        System.out.println("Digite um número válido!");
    }
   
    sc.close();
 }   
}
