using System;
using System.Collections.Generic;
using System.Security.Claims;

namespace Assignment_5_DelegatesEvent
{
    class Program
    {
        static void Main(string[] args)
        {
            var cart = new Cart();
            cart.Id = "C001";
            cart.Customer = "Customer 1";
            cart.City = Cart.EnumCity.HaNoi;
            cart.Country = Cart.EnumCountry.VietNam;

            var product1 = new Product
            {
                Id = "1",
                Name = "San pham 1",
                Description = "San pham 1",
                Price = 14,
                Quantity = 2
            };
            var product2 = new Product
            {
                Id = "2",
                Name = "San pham 2",
                Description = "San pham 2",
                Price = 14,
                Quantity = 5
            };
            var product3 = new Product
            {
                Id = "3",
                Name = "San pham 3",
                Description = "San pham 3",
                Price = 14,
                Quantity = 4
            };

            cart.AddOne(product1);
            cart.AddOne(product2);
            
            Console.WriteLine("Test calculator Total price");
            cart.RemoveOne();
            
            Console.WriteLine("Test calculator Total price");
            cart.CalculatorTotalPrice();
            Console.WriteLine(cart.GrandTotal);
        }

    }
    
}