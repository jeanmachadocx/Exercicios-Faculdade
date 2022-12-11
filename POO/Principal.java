package Teste;

public class Principal{

    String marca;
    Double valor;
    int porta;
    String tipo;
    int velocidademedia=0;

    public Principal(String marca, Double valor, int porta, String tipo, int velocidade){

        this.marca = marca;
        this.valor = valor;
        this.porta = porta;
        this.tipo = tipo;
        this.velocidademedia = velocidade;

    }

    public String getMarca()
    {       
        return this.marca;
    }
    
    public double getValor()
    {   
        return this.valor;   
    }

    public int getPorta()
    {
        return this.porta;        
    }

    public String getTipo()
    {
        return this.tipo;

    }

    public int getvelocidademedia()
    {
        return this.velocidademedia;
       
    }

    public int aumentaVelocidade(){
        if(this.tipo.equalsIgnoreCase("Esportivo")){
            this.velocidademedia = this.velocidademedia + 50;
            return this.velocidademedia;
        }else{
            return this.velocidademedia;
        }
    }

}