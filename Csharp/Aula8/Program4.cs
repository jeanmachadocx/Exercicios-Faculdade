/*4) Strings que gaguejam
Crie um programa que, dada uma string, duplique cada caractere da mesma.
Ex: String de entrada: casa – String de saída: ccaassaa
*/

using System;
public class Program4
{
    public static void Main(string[] args)
    {
        string palavra;
        Console.WriteLine("Escreva uma palavra: ");
        palavra = Console.ReadLine();
        string palavra2 = "";

        for(int i = 0; i< palavra.Length; i++)
        {  
            palavra2 += palavra[i].ToString() + palavra[i].ToString();
        }
        Console.WriteLine(palavra2);
    }
}