// Entre com um nome e imprima o nome somente se a primeira letra do nome for a”(mai ¨ uscula ou ´
// minuscula).
import java.util.*;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("Digite um nome: ");
        nome = sc.next();
        char[] charArray = new char[nome.length()];
        nome.getChars(0, nome.length(), charArray, 0);
        for(char caracter : charArray){
            if(charArray[0] == 'A' || charArray[0] =='a'){
                System.out.println("Nome: " + nome);
                break;
            }else{
                System.out.println(" nome deve começar com A ou a! ");
                break;
            }
        }
        sc.close();
    }
}
