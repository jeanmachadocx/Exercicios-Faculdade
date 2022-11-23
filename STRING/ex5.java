import java.util.*;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome; int tamanho=0;
        System.out.println("Digite um nome: ");
        nome = sc.nextLine();
        char []charArray = new char[nome.length()];
        for(char caracter : charArray){
            tamanho = charArray.length;
        }
        System.out.println(" O nome " + nome + " têm " + tamanho + " letras " );
        sc.close();
    }
}
