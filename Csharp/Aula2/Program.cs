//Escreva um  programa  no  qual  o  usuário  irá  digitar  o  raio  de  uma  circunferência  e  o  seu  programa  irá 
//calcular e mostrar na tela o perímetro, dado por: P = 2 * Pi * raio.
//Considere Pi como 3.14 

using System;
namespace Program1{
public class Program1 { 
    public static void Main(string[] args) {
            Console.WriteLine("Digite o raio da circunferência: ");
            double raio = double.Parse(Console.ReadLine());
            double perimetro = 2 * (3.14) * raio;
            Console.WriteLine("O perimetro é: " + perimetro);
        
        }
    }
}