
// A multiplicac¸ao de dois n ˜ umeros inteiros pode ser feita atrav es de somas sucessivas. Proponha um ´
// algoritmo recursivo Multip Rec(n1,n2) que calcule a multiplicac¸ao de dois inteiros
import java.util.*;
public class exercicio6 {
   public  static int  calcular(int num, int quant){
    if(quant == 1){
        return num;
    }if(num == 0 || quant == 0) {
		return 0;
	}
	return num + calcular(num, quant- 1);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, quant;
        System.out.println("Número: ");
        num = sc.nextInt();
        System.out.println("Quantas vezes?");
        quant = sc.nextInt();
        System.out.println(calcular(num, quant));
        sc.close();

    }
}
