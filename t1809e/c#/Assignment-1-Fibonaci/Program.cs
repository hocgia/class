using System;

namespace Assignment_1_Fibonaci
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.WriteLine("Nhâp vào số:");
                var number = Convert.ToInt32(Console.ReadLine());
                var result = CalculateTheFibonacciNumber(number);
                Console.WriteLine("Số thứ {0} trong dãy Fibonaci là: {1}", number, result);
            }
        }

        private static long CalculateTheFibonacciNumber(int number)
        {
            var result = 1 / Math.Sqrt(5) * (Math.Pow(((1 + Math.Sqrt(5)) / 2), number) - Math.Pow(((1 - Math.Sqrt(5)) / 2), number));
            return (long) result;
        }
    }
}