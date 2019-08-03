using System;
using System.Diagnostics;
using System.Globalization;
using System.Net.Mime;
using System.Threading.Tasks;
using System.Threading;

namespace Thread
{
    class Program
    {
        private static bool _flag = true;

        static void Main(string[] args)
        {
            while (true)
            {
                Console.WriteLine("Nhâp vào một số nguyên:");
                var number = Convert.ToInt64(Console.ReadLine());
                var findFibonacciThread = new System.Threading.Thread(FindFibonacciNumber);
                var countTimeThread = new System.Threading.Thread(CountTime);
                findFibonacciThread.Start(number);
                countTimeThread.Start();
                countTimeThread.Join();
                Console.ReadKey();
                Console.Clear();
            }
        }

        private static void FindFibonacciNumber(object obj)
        {
            var input = (long) obj;
            var index = 0;
            long result = 0;
            while (true)
            {
                var temp = CalculateTheFibonacciNumber(index);
                System.Threading.Thread.Sleep(100);
                if (temp > input)
                {
                    Console.Clear();
                    Console.WriteLine("Số trong dãy fibonacci gần nhất với {0} là: {1}", input, result);
                    _flag = false;
                    break;
                }
                else
                {
                    index++;
                    result = temp;
                }
            }
        }

        private static void CountTime()
        {
            Stopwatch stopwatch = new Stopwatch();
            stopwatch.Start();
            while (_flag)
            {
            }
            stopwatch.Stop();
            Console.WriteLine("Thời gian tính toán là: {0}", stopwatch.Elapsed);
        }

        private static long CalculateTheFibonacciNumber(int number)
        {
            var result = 1 / Math.Sqrt(5) * (Math.Pow(((1 + Math.Sqrt(5)) / 2), number) - Math.Pow(((1 - Math.Sqrt(5)) / 2), number));
            return (long) result;
        }
    }
}
