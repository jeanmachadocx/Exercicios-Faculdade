using System;
struct Carros
{
    private string marca;
    private int ano;
    private float distancia;
    private float consumo;

    public void preenche()
    {
        Console.WriteLine("Digite a marca: ");
        marca = Console.ReadLine();
        Console.WriteLine("Digite o ano: ");
        ano = int.Parse(Console.ReadLine());
        Console.WriteLine("Distância: ");
        distancia = float.Parse(Console.ReadLine());
        Console.WriteLine("Consumo: ");
        consumo = float.Parse(Console.ReadLine());
    }
    public float calcula()
    {
        return (distancia/consumo);
    }

    public static void Main(string[] args) 
    {
        Carros carros = new Carros();
        carros.preenche();
        Console.WriteLine("Km por litro: " + carros.calcula());
    }
}