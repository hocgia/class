using System;

namespace exam
{
    public class Menu
    {
        public void GenerateMenu()
        {
            Console.WriteLine("--------------------MENU--------------------");
            Console.WriteLine("1. Add product records");
            Console.WriteLine("2. Display product records");
            Console.WriteLine("3. Delete product by Id");
            Console.WriteLine("4. Exit");
            Console.WriteLine("--------------------------------------------");
        }

        public void ContinuesAction()
        {
            Console.WriteLine("[Press any key to continue.]");
            Console.ReadKey();
            Console.Clear();
        }
    }
}