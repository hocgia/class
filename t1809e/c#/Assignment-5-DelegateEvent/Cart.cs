using System;
using System.Collections.Generic;

namespace Assignment_5_DelegatesEvent
{
    public delegate void DelegateNotification(string s);
 public class Cart
    {
        public enum EnumCity
        {
            HaNoi = 0,
            HoChiMinh = 1,
            Other = 2,
        }
        
        public enum EnumCountry
        {
            VietNam = 0,
            Other = 1
        }

        public string Id{ get; set; }
        public string Customer{ get; set; }
        public double GrandTotal{ get; set; }
        public List<Product> Products{ get; set; }
        public EnumCity City { get; set; }
        public EnumCountry Country { get; set; }

        public Cart()
        {
            Products = new List<Product>();
        }

        public Cart(string id, string customer, double grandTotal, List<Product> products, EnumCity enumCity, EnumCountry enumCountry)
        {
            Id = id;
            Customer = customer;
            GrandTotal = grandTotal;
            Products = products;
            City = enumCity;
            Country = enumCountry;
        }

        private event DelegateNotification Alert;

        private void Notify(string s)
        {
            Console.WriteLine(s);
        }

        public bool AddOne(Product product)
        {
            if (Products.Contains(product)) return false;
            Products.Add(product);
            if (Alert == null)
            {
                Alert += Notify;
            }
            
            Alert("Add one product.");
            return true;
        }

        public bool RemoveOne()
        {
            Console.WriteLine("List product");
            for (var i = 0; i < Products.Count; i++)
            {
                Console.Write("{0} - ", i + 1);
                Products[i].GetInfo();
            }
            Console.WriteLine("Input index product you want remove:");
            var index = Convert.ToInt32(Console.ReadLine()) - 1;
            if (!(index > 0 && index <= Products.Count))
            {
                Products.RemoveAt(index);
                if (Alert == null)
                {
                    Alert += Notify;
                }
            
                Alert("Notification: Remove product success: " + Products[index].Name);
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
            foreach (var product in Products)
            {
                totalPrice += product.Price * product.Quantity;
            }
            if (Country == EnumCountry.VietNam)
            {
                if (City == EnumCity.HaNoi || City == EnumCity.HoChiMinh)
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

            GrandTotal = totalPrice;
            return totalPrice;
        }
    }
}