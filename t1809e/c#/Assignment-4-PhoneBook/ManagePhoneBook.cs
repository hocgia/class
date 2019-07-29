using System;

namespace Assignment_4_PhoneBook
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
                var choice = Console.ReadLine();
                Console.Clear();
                switch (choice)
                {
                    case "1":
                        Console.WriteLine("1. Insert Phone");
                        controller.InsertPhone();
                        menu.ContinuesAction();
                        break;
                    case "2":
                        Console.WriteLine("2. Remove Phone");
                        controller.RemovePhone();
                        menu.ContinuesAction();
                        break;
                    case "3":
                        Console.WriteLine("3. Update Phone");
                        controller.UpdatePhone();
                        menu.ContinuesAction();
                        break;
                    case "4":
                        Console.WriteLine("4. Search Phone");
                        controller.SearchPhone();
                        menu.ContinuesAction();
                        break;
                    case "5":
                        Console.WriteLine("Exit");
                        break;
                    default:
                        Console.WriteLine("Wrong choice, please re-enter numbers from 1 to 5!");
                        break;
                };
                if (choice == "5")
                {
                    break;
                }
            }
        }
    }
}