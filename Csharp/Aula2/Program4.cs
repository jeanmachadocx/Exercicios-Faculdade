/*4. A queda livre de um objeto (desconsiderando qualquer forma de resistência) é dada pela equação:  
 
d = 1/2 g t ² 
 
Onde d é o deslocamento, g a aceleração da gravidade (9,81m/s² na Terra) e t o tempo. 
Faça um programa que calcule a distância percorrida por um objeto abandonado no ar após um dado 
tempo em segundos informado pelo usuário. 
O programa deve. 
a) Pedir ao usuário que informe o tempo em segundos 
b) Calcular a distância percorrida 
c) Escreve a distância em metros. 
*/

using System;
namespace Program4
{
    public class Program
    {
        static void Main(string[] args)
        {
            const double gravidade = 9.81;
            double distancia, tempo;

            Console.WriteLine("Informe o tempo em segundos: ");
            tempo = double.Parse(Console.ReadLine());
            distancia = 0.5 * gravidade * Math.Pow(tempo, 2);
            Console.WriteLine("A distância é: " + distancia);

        }
    }
}
