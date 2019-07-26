using System;
using System.Collections;
using System.Collections.Generic;

namespace assignment_3_new
{
    class Program
    {
        static void Main(string[] args)
        {
            var menu = new Menu();
            var controller = new Controller();
            while (true)
            {
                menu.GenerateMenu();
                Console.WriteLine("Input you choice:");
                var choice = Convert.ToInt32(Console.ReadLine());
                Console.Clear();
                switch (choice)
                {
                    case 1:
                        Console.WriteLine("Insert news");
                        controller.Create();
                        break;
                    case 2:
                        Console.WriteLine("View list news");
                        controller.Read();
                        break;
                    case 3:
                        Console.WriteLine("Average rate");
                        controller.AverageRate();
                        break;
                    case 4:
                        Console.WriteLine("Exit");
                        break;
                    default:
                        Console.WriteLine("Wrong choice, please re-enter numbers from 1 to 4!");
                        break;
                };
                if (choice == 4)
                {
                    break;
                }
            }
        }
    }
}