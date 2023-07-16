// using System;
// public class Exercicio2
// {

//     public static void preencheMatrizes(int[,] matrizA, int[,] matrizB)
//     {
//         Random rd = new Random();
//         for (int i = 0; i < matrizA.GetLength(0); i++)
//         {
//             for (int j = 0; j < matrizA.GetLength(1); j++)
//             {
//                 matrizA[i, j] = rd.Next(0,101);
//             }
//         }


//         for (int i = 0; i < matrizB.GetLength(0); i++)
//         {
//             for (int j = 0; j < matrizB.GetLength(1); j++)
//             {
//                 matrizB[i, j] = rd.Next(0,101);
//             }
//         }

//         Console.WriteLine("matriz A: ");
//         for (int i = 0; i < matrizA.GetLength(0); i++)
//         {
//             for (int j = 0; j < matrizA.GetLength(1); j++)
//             {
//                 Console.Write(matrizA[i,j] + " ");
//             } Console.WriteLine();
//         }
//         Console.WriteLine();

//          Console.WriteLine("matriz B: ");
//         for (int i = 0; i < matrizB.GetLength(0); i++)
//         {
//             for (int j = 0; j < matrizB.GetLength(1); j++)
//             {
//                 Console.Write(matrizB[i,j] + " ");
//             } Console.WriteLine();
//         }
//     }
//     public static int[,] calculaSoma(int[,] matrizA, int[,] matrizB)
//     {
//         int [,] matrizSoma = new int [matrizA.GetLength(0), matrizA.GetLength(1)]; 
//         for (int i = 0; i < matrizA.GetLength(0); i++)
//         {
//             for (int j = 0; j < matrizB.GetLength(1); j++)
//             {
//                 matrizSoma[i, j] = matrizA[i, j] + matrizB[i, j];
//             }
//         }
//         return matrizSoma;
        
//     }
//     public static int[,] calculaDiferenca(int[,] matrizA, int[,] matrizB)
//     {
//          int [,] matrizDiferenca = new int [matrizA.GetLength(0), matrizA.GetLength(1)]; 
//         for (int i = 0; i < matrizA.GetLength(0); i++)
//         {
//             for (int j = 0; j < matrizB.GetLength(1); j++)
//             {
//                 matrizDiferenca[i, j] = matrizA[i, j] - matrizB[i, j];
//             }
//         }
//         return matrizDiferenca;
//     }
//     public static void Main(string[] args)
//     {
//         int[,] matrizA = new int[4, 6];
//         int[,] matrizB = new int[4, 6];
//         preencheMatrizes(matrizA, matrizB);

//         int[,] MatrizSoma = calculaSoma(matrizA, matrizB);
//         int[,] MatrizDiferenca = calculaDiferenca(matrizA, matrizB);

//         Console.WriteLine("\n Matriz Soma: ");
//         for (int i = 0; i < matrizA.GetLength(0); i++)
//         {
//             for (int j = 0; j < matrizB.GetLength(1); j++)
//             {
//                 Console.Write(MatrizSoma[i, j] + " ");
//             } Console.WriteLine();
//         }

//         Console.WriteLine("\n Matriz Diferença: ");
//         for (int i = 0; i < matrizA.GetLength(0); i++)
//         {
//             for (int j = 0; j < matrizB.GetLength(1); j++)
//             {
//                 Console.Write(MatrizDiferenca[i, j] + " ");
//             } Console.WriteLine();
//         }
//     }
// }