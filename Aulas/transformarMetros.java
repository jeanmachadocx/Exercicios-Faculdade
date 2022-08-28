
import java.util.*;
public class transformarMetros{    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Definindo as variaveis   
        double metro,cm, dm,mm;
        System.out.println("Digite o tamanho do metro");
        //guardei o valor de metros
        metro = sc.nextDouble();
        //formula "igual do excel"
        mm = metro*1000;
        cm = metro*100;
        dm = metro*10;
        //Imprimindo na tela
        System.out.println(metro + " metros em milimetros é: " +mm);
        System.out.println(metro + " metros em centrimetros é: " +cm);
        System.out.println(metro + " metros em decimetros é: " +dm);
        sc.close();
     }
  } 

