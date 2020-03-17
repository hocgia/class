using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace assignment_shop.Models
{
    public class CategoryModels:ModelUtils
    {
        public string Id { get; set; }
        public string Name { get; set; }
        public string Description { get; set; }
        public virtual ICollection<ProductModels> Products { get; set; }
    }
}