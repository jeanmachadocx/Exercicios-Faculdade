//Faça um  programa  que  leia  4  notas  de  4  alunos, calcule  e  mostre  na  tela a  soma  e  a  média aritmética 
//das notas. 
 


using System;
using System.Net.Http.Headers;

namespace Program2
{
    public class Program2
    {
        public static void Main(string[] args)
        {
            double[] notas = new double[4];
            double media=0, soma=0;
            for(int i = 0; i <notas.Length; i++){
                Console.WriteLine("Insira as notas: ");
                notas[i] = double.Parse(Console.ReadLine());
                soma += notas[i];
                media = soma / 4;
                
            }

            for(int j = 0; j <notas.Length; j++)
            {
                Console.WriteLine("As notas digitadas foram: " + notas[j]);
                Console.WriteLine("A soma das notas é: " + soma);
                Console.WriteLine("A média: " + media);
                break;
            }

                
        }
    }
}
