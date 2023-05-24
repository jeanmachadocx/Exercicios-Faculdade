/* 7) Crie um programa que mostre todos os caracteres de uma string que são repetidos.
Se a string não tiver caracteres repetidos, mostre uma mensagem na tela. */

using System; 
public class Program7
{
    public static void Main(string[] args)
    {
        string palavra;
        Console.WriteLine("Escreva uma palavra: ");
        palavra = Console.ReadLine();
        string repetidos = "";

        int tamanho = palavra.Length;
        bool repete = false;

        for(int i=0; i<tamanho; i++)
        {
            char atual = palavra[i];

            for(int j =i+1; j<tamanho; j++)
            {
                if (atual == palavra[j])
                {
                    repetidos += atual;
                    repete = true;
                }
                
            }

        }
        
        if (repete == false)
        {
            Console.WriteLine("Não há caracter repetido");
        }
        else
        {
            Console.WriteLine("Repetidos: " + repetidos);
        }
        
    }
}
