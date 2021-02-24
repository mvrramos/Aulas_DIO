using System;

namespace Desafios{
    class Divisao{
        static void Main(string[] args){
            decimal x, y, q;
            decimal divisao;

            Console.WriteLine("Qual a quantidade de pares? ");
            q = int.Parse(Console.ReadLine());

            for (int i = 0; i < q; i++){
                                
                Console.WriteLine("Digite o numero 1: ");
                x = int.Parse(Console.ReadLine());

                Console.WriteLine("Digite o numero 2: ");
                y = int.Parse(Console.ReadLine());

                if (y < 0){
                    Console.WriteLine("divisao impossivel");
                }else{
                    divisao = x/y;
                    Console.WriteLine(divisao);
                }
            }

        }
    }
}