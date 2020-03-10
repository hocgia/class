using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ex_1_cart.Models
{
    public class CartItem
    {
        public string UserId { get; set; }
        public string ProductId { get; set; }
        public int Quantity { get; set; }
    }
}