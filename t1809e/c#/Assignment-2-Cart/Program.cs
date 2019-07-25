using System;
using Assignment_2_overloading;

namespace Assignment_2_Cart
{
    class Program
    {
        static void Main(string[] args)
        {
            var cart = new Cart();
            cart._id = "C001";
            cart._customer = "Customer 1";
            cart._city = Cart.city.HaNoi;
            cart._country = Cart.country.VietNam;


            var product1 = new Product
            {
                _id = "1",
                _name = "San pham 1",
                _description = "San pham 1",
                _price = 14,
                _quantity = 2
            };
            var product2 = new Product
            {
                _id = "2",
                _name = "San pham 2",
                _description = "San pham 2",
                _price = 14,
                _quantity = 5
            };
            var product3 = new Product
            {
                _id = "3",
                _name = "San pham 3",
                _description = "San pham 3",
                _price = 14,
                _quantity = 4
            };
            
            cart.AddOne(product1);
            cart.AddOne(product2);
            
            cart.RemoveOne();

            cart.CalculatorTotalPrice();

        }
    }
    
}