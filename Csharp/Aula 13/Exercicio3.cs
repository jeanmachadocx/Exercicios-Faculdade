// using System;
// public class Exercicio3
// {
//     public static void preencheMatriz(int[,] matriz)
//     {
//         Random rd = new Random();
//         for (int i = 0; i < matriz.GetLength(0); i++)
//         {
//             for (int j = 0; j < matriz.GetLength(1); j++)
//             {
//                 matriz[i, j] = rd.Next(0, 11);
//             }
//         }
//     }
//     public static void escreverMatriz(int[,]matriz){
//         Console.WriteLine("Matriz:");

//         for (int i = 0; i < matriz.GetLength(0); i++)
//         {
//             for (int j = 0; j < matriz.GetLength(1); j++)
//             {
//                 Console.Write(matriz[i, j] + " ");
//             }
//             Console.WriteLine();
//         }
//     }
//     public static void primeiraMudanca(int[,] matriz, int linha1, int linha2)
//     {
//         int colunas = matriz.GetLength(1); //1 = coluna
//         for (int j = 0; j < colunas; j++)
//         {
//             int temp = matriz[linha1, linha2];
//             matriz[linha1, j] = matriz[linha2, j];
//             matriz[linha2, j] = temp;
//         }
//     }

//     public static void segundaMudanca(int[,] matriz, int coluna1, int coluna2)
//     {
//         int linhas = matriz.GetLength(0); //0= linha
//         for (int i = 0; i < linhas; i++)
//         {
//             int temp = matriz[coluna1, coluna2];
//             matriz[coluna1, i] = matriz[coluna2, i];
//             matriz[coluna2, i] = temp;
//         }
//     }

//     public static void inverteDiagonais(int[,]matriz)
//     {
//         int tamanho = matriz.GetLength(0);
//         for (int i = 0; i < tamanho; i++)
//         {
//             int temp = matriz[i, i];
//             matriz[i, i] = matriz[i, tamanho - 1 - i];
//             matriz[i, tamanho - 1 - i] = temp;
//         }
//     }

//     public static void trocarLinhaComColuna(int[,] matriz, int linha, int coluna)
//     {
//         int tamanho = matriz.GetLength(0);
//         for (int i = 0; i < tamanho; i++)
//         {
//             int temp = matriz[i, linha];
//             matriz[i, linha] = matriz[i, coluna];
//             matriz[i, coluna] = temp;
//         }
//     }

//     public static void Main(String[] args)
//     {
//         int[,] matriz = new int[10, 10];
//         preencheMatriz(matriz);
//         escreverMatriz(matriz);

//         //trocar linha 2 com a 8
//         primeiraMudanca(matriz,1,7);
//         escreverMatriz(matriz);

//         //trocar coluna 4 com a 10
//         segundaMudanca(matriz,3,9);
//         escreverMatriz(matriz);

//         //inverte diagonal principal com secundaria
//         inverteDiagonais(matriz);
//         escreverMatriz(matriz);

//         //inverte linha 5 com coluna 10 
//         trocarLinhaComColuna(matriz,4,9);


//     }
// }
