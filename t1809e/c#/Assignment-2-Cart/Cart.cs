using System;
using System.Collections;
using System.Collections.Generic;
using Assignment_2_overloading;

namespace Assignment_2_Cart
{
    public class Cart
    {
        public enum city
        {
            HaNoi = 0,
            HoChiMinh = 1,
            Other = 2,
        }
        
        public enum country
        {
            VietNam = 0,
            Other = 1
        }
        
        public string _id;
        public string _customer;
        public long _grandtotal;
        public List<Product> _products;
        public city _city;
        public country _country;

        public Cart()
        {
            _products = new List<Product>();
        }

        public Cart(string id, string customer, long grandtotal, List<Product> products, city city, country country)
        {
            _id = id;
            _customer = customer;
            _grandtotal = grandtotal;
            _products = products;
            _city = city;
            _country = country;
        }

        public bool AddOne(Product product)
        {
            if (_products.Contains(product)) return false;
            _products.Add(product);
            return true;
        }

        public bool RemoveOne()
        {
            Console.WriteLine("List product");
            for (var i = 0; i < _products.Count; i++)
            {
                Console.Write(i + 1);
                _products[i].GetInfo();
            }
            Console.WriteLine("Input index product you want remove:");
            var index = Convert.ToInt32(Console.ReadLine()) - 1;
            if (!(index > 0 && index <= _products.Count))
            {
                _products.RemoveAt(index);
                Console.WriteLine("Remove product success: {0}", _products[index]._name);    
                return true;
            }
            else
            {
                Console.WriteLine("Invalid index!");
                return false;
            }
        }

        public double CalculatorTotalPrice()
        {
            double totalPrice = 0;
            foreach (var product in _products)
            {
                totalPrice += product._price * product._quantity;
            }
            if (_country == country.VietNam)
            {
                if (_city == city.HaNoi || _city == city.HoChiMinh)
                {
                    totalPrice += totalPrice * 1 / 100;
                }
                else
                {
                    totalPrice += totalPrice * 2 / 100;
                }
            }
            else
            {
                totalPrice += totalPrice * 5 / 100;
            }
            return totalPrice;
        }
    }
}
