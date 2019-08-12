using System;

namespace exam
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
                Console.WriteLine("Enter your selection:");
                var choice = Console.ReadLine();
                switch (choice)
                {
                    case "1":
                        Console.Clear();
                        Console.WriteLine("1. Add product records");
                        controller.Create();
                        menu.ContinuesAction();
                        break;
                    case "2":
                        Console.Clear();
                        Console.WriteLine("2. Display product records");
                        controller.Show();
                        menu.ContinuesAction();
                        break;
                    case "3":
                        Console.Clear();
                        Console.WriteLine("3. Delete product by Id");
                        controller.DeleteById();
                        menu.ContinuesAction();
                        break;
                    case "4":
                        Console.WriteLine("Exit");
                        Environment.Exit(0);
                        break;
                    default:
                        Console.WriteLine("Incorrect entry, please enter numbers from 1 - 4.");
                        break;
                };
            }
        }
    }
}
