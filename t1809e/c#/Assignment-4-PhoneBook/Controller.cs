using System;

namespace Assignment_4_PhoneBook
{
    public class Controller
    {
        PhoneBook _phoneBook = new PhoneBook();
        public void InsertPhone()
        {
            Console.WriteLine("Input name:");
            var name = Console.ReadLine();
            Console.WriteLine("Input phone:");
            var phone = Console.ReadLine();
            _phoneBook.InsertPhone(name, phone);
            Console.WriteLine("Insert success!");
        }

        public void RemovePhone()
        {
            Console.WriteLine("Input name:");
            var name = Console.ReadLine();
            Console.WriteLine(_phoneBook.RemovePhone(name) ? "Remove success!" : "Name not found!");
        }

        public void UpdatePhone()
        {
            _phoneBook.Show();
            Console.WriteLine("Input name to update phone number:");
            var name = Console.ReadLine();
            Console.WriteLine("Input phone:");
            var phone = Console.ReadLine();
            if (_phoneBook.UpdatePhone(name, phone))
            {
                Console.WriteLine("Update success!");
            }
            else
            {
                Console.WriteLine("Update errors!");   
            }
        }

        public void SearchPhone()
        {
            Console.WriteLine("Input name");
            var phoneNumber = _phoneBook.SearchPhone(Console.ReadLine());
            if (phoneNumber != null)
            {
                Console.WriteLine("name: {0}; phone: {1}", phoneNumber.Name, phoneNumber.Phone);
            }
            else
            {
                Console.WriteLine("Name not found!");
            }
        }
    }
}