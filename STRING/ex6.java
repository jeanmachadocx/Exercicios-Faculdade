
// Ler nome, sexo e idade. Se sexo for feminino e idade menor que 25, imprime o nome da pessoa e a
// palavra ACEITA”, caso contr ¨ ario imprimir ”N ´ AO ACEITA”.
import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sexo;
        int idade;
        System.out.print("Digite seu: NOME, SEXO e IDADE: ");
        nome = sc.next();
        sexo = sc.next();
        idade = sc.nextInt();
        if (idade < 25 && sexo.equalsIgnoreCase("feminino")) {
            System.out.println(nome + " ACEITA");
        } else {
            System.out.println("Não aceita");
        } 
        sc.close();
    }

}
