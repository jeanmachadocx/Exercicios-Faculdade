//3.Faça um algoritmo que leia a idade de uma pessoa em anos, meses e dias e mostre-a expressa em dias. 
//(Nota: considere todos os anos com 365 dias e todos os meses com 30 dias). 

using System;
using System.Diagnostics;
using System.IO.Pipes;

namespace Program3{
public class Program3 {
    public static void Main(String[] args){
            Console.WriteLine("Digite os anos: ");
            int ano = int.Parse(Console.ReadLine());
            Console.WriteLine("Digite os meses: ");
            int mes = int.Parse(Console.ReadLine());
            Console.WriteLine("Insira os dias: ");
            int dia = int.Parse(Console.ReadLine());
            int tempoTotal = ano * 365 + mes * 30 + dia;
            Console.WriteLine("A idade em dias é: " + tempoTotal);
        }
 }
}