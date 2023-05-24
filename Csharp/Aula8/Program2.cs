using System;

public class Program2
{
    public static void Main(string[] args)
    {
        string a, b, c;

        Console.WriteLine("Escreva uma palavra: ");
        a = Console.ReadLine();
        Console.WriteLine("Escreva mais uma palavra: ");
        b = Console.ReadLine();

        char[] caracteresA = a.ToCharArray();
        char[] caracteresB = b.ToCharArray();
        c = "";

        int i = 0;
        int j = 0;
        int tamanhoTotal = a.Length + b.Length;

        for (int k = 0; k < tamanhoTotal; k++)
        {
            if (i < a.Length)
            {
                c += caracteresA[i];
                i++;
            }

            if (j < b.Length)
            {
                c += caracteresB[j];
                j++;
            }
        }

        Console.WriteLine($"Primeira string: {a}");
        Console.WriteLine($"Segunda string: {b}");
        Console.WriteLine($"String mesclada: {c}");

        
    }
}
