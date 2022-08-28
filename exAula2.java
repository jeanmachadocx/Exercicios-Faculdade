import java.util.*;
public class exAula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sexo, estado_civil;
        System.out.println("Digite o seu nome");
        nome = sc.nextLine();
        System.out.println("Defina o sexo");
        sexo = sc.nextLine();
        System.out.println("Informe o tempo de matrimônio");
        estado_civil = sc.nextLine();
        if(sexo == "F" && estado_civil == "CASADA"){
           int tempo_casado;
            System.out.println("Digite o tempo de casado");
            tempo_casado = sc.nextInt();
        }
        sc.close();
    }
}
