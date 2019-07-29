using System;

namespace Assignment_4_PhoneBook
{
    public class Menu
    {
        public void GenerateMenu()
        {
            Console.WriteLine("PHONE BOOK MANAGEMENT SYSTEM");
            Console.WriteLine("1. Insert Phone");
            Console.WriteLine("2. Remove Phone");
            Console.WriteLine("3. Update Phone");
            Console.WriteLine("4. Search Phone");
            Console.WriteLine("5. Exit");
        }

        public void ContinuesAction()
        {
            Console.WriteLine("Press any key to continue.");
            Console.ReadKey();
            Console.Clear();
        }
    }
}