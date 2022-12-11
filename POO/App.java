
package Teste;

public class App {

    public static void main(String[] args)
    {

        Principal ferrari = new Principal("Ferrari", 10000.0, 4, "Compacto", 50);

        System.out.println("Velocidade inicial: " + ferrari.getvelocidademedia() + "\n");
        System.out.println("Velocidade média " + ferrari.aumentaVelocidade() + "\n" );
        System.out.println(" Marca " + ferrari.getMarca()+ "\n");
        System.out.println(" Valor " + ferrari.getValor()+ "\n");
        System.out.println(" Porta " + ferrari.getPorta()+ "\n");
        System.out.println("Tipo do veículo: " + ferrari.getTipo()+ "\n");




    }
}
