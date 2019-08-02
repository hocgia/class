using System;
using System.Globalization;
using System.Threading.Tasks;
using System.Threading;

namespace Thread
{
    class Program
    {
        static void Main(string[] args)
        {
            var thread = new System.Threading.Thread(Countdown);
            thread.Start();
        }

        public static void Countdown()
        {
            Console.WriteLine("{0,2:00}:{1,2:00}", 10, 00);
            System.Threading.Thread.Sleep(1000);
            for (var i = 9; i >= 0; i--)
            {
                for (var j = 59; j >= 0; j--)
                {
                    Console.WriteLine("{0,2:00}:{1,2:00}", i, j);
                    System.Threading.Thread.Sleep(1000);
                }
            }

            Console.WriteLine("Time out.");
        }
    }
}