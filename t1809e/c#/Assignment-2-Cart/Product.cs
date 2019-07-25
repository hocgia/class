using System;
using System.Collections;

namespace Assignment_2_overloading
{
    public class Product
    {
        public string _id;
        public string _name;
        public long _price;
        public int _quantity;
        public string _description;
        public ArrayList _gallery;

        public Product()
        {
            _gallery = new ArrayList();
        }

        public Product(string id, string name, long price, int quantity, string description, ArrayList gallery)
        {
            _id = id;
            _name = name;
            _price = price;
            _quantity = quantity;
            _description = description;
            _gallery = gallery;
        }

        public void GetInfo()
        {
            Console.Write("Id: {0}; Name: {1}; Price: {2}; Quantity: {3}; Description: {4}; Gallery:", _id, _name, _price, _quantity, _description);
            foreach (var temp in _gallery)
            {
                Console.Write("{0}, ",temp);    
            }
            Console.WriteLine();
        }

        public void NotificationStock()
        {
            Console.WriteLine(_quantity > 0 ? "In stock!" : "Out of stock!");
        }

        public void AddImage(string obj)
        {
            if (_gallery.Count > 10)
            {
                Console.WriteLine("Gallery cannot exceed 10 elements!");
            }
            else
            {
                _gallery.Add(obj);
                Console.WriteLine("Add image success!");
            }
        }
        
        public void RemoveImage()
        {
            var length = _gallery.Count;
            for (var i =  0; i < length; i++)
            {
                Console.WriteLine("{0}: {1}",i + 1, _gallery[i]);
            }
            Console.WriteLine("Input index of image.");
            var index = Convert.ToInt32(Console.ReadLine()) - 1;
            if (index >= length || index <= 0)
            {
                Console.WriteLine("Input wrong!");
            }
            else
            {
                _gallery.RemoveAt(index);
                Console.WriteLine("Remove success!");
            }
        }
    }
}
