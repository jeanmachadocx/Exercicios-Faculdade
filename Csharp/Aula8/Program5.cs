/* Fazer um programa de “criptografia” (codificação de dados visando a privacidade
de acesso as informações), onde dada uma string este programa codifique os dados
através de um processo de substituição de letras. */


using System;
public class Program5
{
    public static void Main(string[] args)
    {
        string palavra;
        Console.WriteLine("Escreva uma palavra: ");
        palavra = Console.ReadLine();
        palavra.ToLower();
        string palavra2 = "";

        for (int i = 0; i < palavra.Length; i++)
        {
          char letraAtual = palavra[i];
          char proximaLetra = letraAtual;

            if(letraAtual == 'a')
            {
                proximaLetra = 'z';
            }
            else
            {
                proximaLetra = (char)(letraAtual-1);
            }
            palavra2 += proximaLetra.ToString();
        }
        Console.Write("Palavra digitada " + palavra);
        Console.Write($"Criptografada: {palavra2}");
    }
}