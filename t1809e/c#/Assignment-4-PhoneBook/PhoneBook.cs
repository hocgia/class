using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Assignment_4_PhoneBook
{
    public class PhoneBook : Phone
    {
        private List<PhoneNumber> _phoneNumbers = new List<PhoneNumber>();

        public override void InsertPhone(string name, string phone)
        {
            var index = FindByName(name);
            if (index == -1)
            {
                _phoneNumbers.Add(new PhoneNumber(name, phone));
            }
            else
            {
                var newPhone = new StringBuilder();
                newPhone.Append(_phoneNumbers[index].Phone);
                newPhone.Append(" : ");
                newPhone.Append(phone.Trim());
                _phoneNumbers[index].Phone = newPhone.ToString();
            }
        }

        public override bool RemovePhone(string name)
        {
            var index = FindByName(name);
            if (index == -1)
            {
                return false;
            }
            
            _phoneNumbers.RemoveAt(index);
            return true;
        }

        public override bool UpdatePhone(string name, string newphone)
        {
            var index = FindByName(name);
            if (index == -1)
            {
                return false;
            }

            _phoneNumbers[index].Phone = newphone;
            return true;
        }

        public override PhoneNumber SearchPhone(string name)
        {
            var index = FindByName(name);
            if (index == -1)
            {
                return null;
            }
            
            return _phoneNumbers[index];
        }

        public void Show()
        {
            Console.WriteLine("{0, 8}", "PhoneBook");
            Console.WriteLine("{0, 10} | {1, 10}", "Name", "Phone");
            foreach (var phoneNumber in _phoneNumbers)
            {
                Console.WriteLine("{0, 10} | {1, 10}", phoneNumber.Name, phoneNumber.Phone);
            }
        }

        private int FindByName(string name)
        {
            for (var i = 0; i < _phoneNumbers.Count; i++)
            {
                if (_phoneNumbers[i].Name == name)
                {
                    return i;
                }
            }

            return -1;
        }
    }
}