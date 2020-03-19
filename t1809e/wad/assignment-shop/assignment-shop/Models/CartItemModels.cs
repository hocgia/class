using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Web;

namespace assignment_shop.Models
{
    public class CartItemModels
    {
        public string UserId { get; set; }
        public string ProductId { get; set; }
        public string ProductThumbnail { get; set; }
        public long ProductPrice { get; set; }
        public int Quantity { get; set; }
        public double TotalItemPrice => ProductPrice * Quantity;
    }
}