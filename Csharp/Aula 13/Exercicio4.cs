// using System;
// public class Exercicio4
// {

//     public static void preencheVetores(int[] vetorA, int[] vetorB)
//     {
//         Random rd = new Random();
//         for (int i = 0; i < vetorA.Length; i++)
//         {
//             vetorA[i] = rd.Next(0, 11);
//             vetorB[i] = rd.Next(0, 11);
//         }
//     }

//     public static void printaVetores(int[] vetor)
//     {
//          Console.WriteLine("Conteúdo do vetor:");
//         for (int i = 0; i < vetor.Length; i++)
//         {
//             Console.Write(vetor[i] + " ");
//         }
//         Console.WriteLine();
//     }

//     public static int[] alternaVetores(int[] vetorA, int[] vetorB)
//     {
//        int[] vetorIntercalado = new int[vetorA.Length + vetorB.Length];
//         int indexA = 0;
//         int indexB = 1;
//         for (int i = 0; i < vetorA.Length; i++)
//         {
//             vetorIntercalado[indexA] = vetorA[i];
//             vetorIntercalado[indexB] = vetorB[i];
//             indexA += 2;
//             indexB += 2;
//         }
//         return vetorIntercalado;
//     }

//     public static void Main(string[] args)
//     {
//         int[] vetorA = new int[10];
//         int[] vetorB = new int[10];
//         preencheVetores(vetorA, vetorB);
//         Console.WriteLine("Vetor A: ");
//         printaVetores(vetorA);
//         Console.WriteLine("Vetor B: ");
//         printaVetores(vetorB);
       
       
//         int[] vetorIntercalado = alternaVetores(vetorA,vetorB);
//         Console.WriteLine("\n Vetor intercalado: ");
//         printaVetores(vetorIntercalado);

      
//     }
// }
