namespace Assignment_4_PhoneBook
{
    public class PhoneNumber
    {
        public string Name { get; set; }
        public string Phone { get; set; }

        public PhoneNumber()
        {
        }

        public PhoneNumber(string name, string phone)
        {
            Name = name;
            Phone = phone;
        }
    }
}