//Escreva um programa onde serão fornecidos como entrada de dados dois valores inteiros,
//calcule e imprima a soma, o produto, a diferença, o quociente destes números. 

using System;
namespace Program
{
    public class Program
    {
        static void Main(string[] args)
        {
            int opcao;
            double numero1, numero2, resultado;
            Console.WriteLine("Escolha uma opção: 1 Soma, 2 Subtração, 3 Produto, 4 Divisão");
            opcao = int.Parse(Console.ReadLine());
            Console.WriteLine("Digite dois números: ");
            numero1 = double.Parse(Console.ReadLine());
            numero2 = double.Parse(Console.ReadLine());
           
                switch (opcao){
                    case 1:
                        resultado = numero1 + numero2;
                        Console.WriteLine(resultado);
                        break;

                    case 2:
                        resultado = numero1 - numero2;
                        Console.WriteLine(resultado);
                        break;

                    case 3:
                        resultado = numero1 * numero2;
                        Console.WriteLine(resultado);
                        break;

                    case 4:
                        resultado = numero1 / numero2;
                        Console.WriteLine(resultado);
                        break;

                    default:
                        Console.WriteLine("Opção inválida!");
                        break;
                }
            }
        }
    }
