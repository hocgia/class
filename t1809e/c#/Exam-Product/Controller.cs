using System;
using System.Collections.Generic;

namespace exam
{
    public class Controller
    {
        private List<Product> _products = new List<Product>();
        
        public void Create()
        {
            Console.WriteLine("Input Product Id:");
            var id = Console.ReadLine();
            Console.WriteLine("Input Product Name:");
            var name = Console.ReadLine();
            Console.WriteLine("Input Price:");
            var price = Convert.ToInt64(Console.ReadLine());
            Product product = new Product(id, name, price);
            _products.Add(product);
            Console.WriteLine("Add success!");
        }

        public void Show()
        {
            Console.WriteLine("| {0, -15} | {1, -15} | {2, -15} |", "Product Id", "Product Name", "Price");
            foreach (var product in _products)
            {
                Console.WriteLine("| {0, -15} | {1, -15} | ${2, -14} |",product.ProductId, product.Name, product.Price);
            }
        }

        public void DeleteById()
        {
            Console.WriteLine("Product List");
            Console.WriteLine("input product id to delete:");
            var productId = Console.ReadLine();
            var flag = false;
            for (var i = 0; i < _products.Count; i++)
            {
                if (productId == _products[i].ProductId)
                {
                    continue;
                }
                _products.RemoveAt(i);
                flag = true;
                break;
            }

            Console.WriteLine(flag ? "Delete success." : "Delete error.");
        }
    }
}