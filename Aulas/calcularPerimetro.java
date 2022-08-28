import java.util.*;
public class calcularPerimetro {
    public static void main(String[] args) {
      //Captura dados do usuario
        Scanner leitura = new Scanner(System.in);
        //Definir as variaveis
        int base, altura, perimetro;
        System.out.println("Qual o valor da base?");
        base = leitura.nextInt();
        System.out.println("Qual o valor da altura?");
        altura = leitura.nextInt();
        if(base > 0 && altura <0){
          //calcular perimetro
        perimetro = 2*altura + 2*base;
        System.out.println("O perimetro é " +perimetro );
        } else{
          System.out.println("ERRO");
        }
        
        leitura.close();
    }
}
