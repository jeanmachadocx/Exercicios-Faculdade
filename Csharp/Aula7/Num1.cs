/*Faça um programa que leia os elementos de uma matriz 3 x 5 com números inteiros, calcule e
imprima a quantidade de elementos maiores que 40 */

public class Num1
{
    public static void Main(string[] args)
    {
        int[,] matriz = new int[3, 5];
        int contador = 0;
        for (int linha = 0; linha < matriz.GetLength(0); linha++)
        {
            for (int coluna = 0; coluna < matriz.GetLength(1); coluna++)
            {
                Console.WriteLine("Preencha a matriz: ");
                matriz[linha, coluna] = int.Parse(Console.ReadLine());
                if (matriz[linha,coluna] > 40)
                {
                    contador++;
                }
            }
        }

        Console.Write("MATRIZ: \n");
        for (int linha = 0; linha < matriz.GetLength(0); linha++)
        {
            for (int coluna = 0; coluna < matriz.GetLength(1); coluna++)
            {
                Console.Write(" " + matriz[linha, coluna]);
            }
            Console.WriteLine();

        }

        Console.WriteLine("Quantidade de elementos maiores que 40= "+contador);

    }
}