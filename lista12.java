// 12. Leia a distancia em Km e a quantidade de litros de gasolina consumidos por um carro em um percurso,
// calcule o consumo em Km/l e escreva uma mensagem de acordo com a tabela abaixo:
// Consumo Km/l Mensagem
// menor que 8 Venda o carro!
// entre 8 e 14 Economico! ˆ
// maior que 12 Super economico


import java.util.*;
public class lista12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float consumo;
        System.out.println("Digite o consumo do seu veículo:");
        consumo = sc.nextFloat();
        if(consumo <8){
            System.out.println(" Venda o carro!");
        }else if((consumo >=8)&&(consumo<12)){
            System.out.println(" Carro econômico!");
        }else if(consumo >=12){
            System.out.println("Carro super econômico");
        }
        sc.close();
    }
}
