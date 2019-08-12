namespace exam
{
    public class Product
    {
        public string ProductId { get; set; }
        public string Name { get; set; }
        public long Price { get; set; }

        public Product()
        {
        }

        public Product(string productId, string name, long price)
        {
            ProductId = productId;
            Name = name;
            Price = price;
        }
    }
}