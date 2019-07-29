using System;

namespace Assignment_4_PhoneBook
{
    public abstract class Phone
    {
        public abstract void InsertPhone(string name, string phone);
        public abstract bool RemovePhone(string name);
        public abstract bool UpdatePhone(string name, string newphone);
        public abstract PhoneNumber SearchPhone(string name);
    }
}