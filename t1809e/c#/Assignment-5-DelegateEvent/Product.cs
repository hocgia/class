using System;
using System.Collections;

namespace Assignment_5_DelegatesEvent
{
    public class Product
    {
        public string Id { get; set; }
        public string Name { get; set; }
        public long Price { get; set; }
        public int Quantity { get; set; }
        public string Description { get; set; }
        public ArrayList Gallery { get; set; }

        public Product()
        {
            Gallery = new ArrayList();
        }

        public Product(string id, string name, long price, int quantity, string description, ArrayList gallery)
        {
            Id = id;
            Name = name;
            Price = price;
            Quantity = quantity;
            Description = description;
            Gallery = gallery;
        }

        public void GetInfo()
        {
            Console.Write("Id: {0}; Name: {1}; Price: {2}; Quantity: {3}; Description: {4}; Gallery:", Id, Name, Price, Quantity, Description);
            foreach (var temp in Gallery)
            {
                Console.Write("{0}, ", temp);
            }

            Console.WriteLine();
        }

        public void NotificationStock()
        {
            Console.WriteLine(Quantity > 0 ? "In stock!" : "Out of stock!");
        }

        public void AddImage(string obj)
        {
            if (Gallery.Count > 10)
            {
                Console.WriteLine("Gallery cannot exceed 10 elements!");
            }
            else
            {
                Gallery.Add(obj);
                Console.WriteLine("Add image success!");
            }
        }

        public void RemoveImage()
        {
            var length = Gallery.Count;
            for (var i = 0; i < length; i++)
            {
                Console.WriteLine("{0}: {1}", i + 1, Gallery[i]);
            }

            Console.WriteLine("Input index of image.");
            var index = Convert.ToInt32(Console.ReadLine()) - 1;
            if (index >= length || index <= 0)
            {
                Console.WriteLine("Input wrong!");
            }
            else
            {
                Gallery.RemoveAt(index);
                Console.WriteLine("Remove success!");
            }
        }
    }
}