using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace assignment_shop.Models
{
    public class ProductCategory
    {
        public IEnumerable<ProductModels> Products { get; set; }
        public IEnumerable<CategoryModels> Categories { get; set; }
    }
}