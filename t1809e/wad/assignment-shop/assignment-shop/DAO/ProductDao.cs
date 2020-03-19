using assignment_shop.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace assignment_shop.DAO
{
    public class ProductDAO
    {
        private ApplicationDbContext db = new ApplicationDbContext();
        public List<ProductModels> FindByName(string keyword)
        {
            var productModels = db.ProductModels.Where(s => s.Name.Contains(keyword));
            return productModels.ToList();
        }

        public List<ProductModels> FindByCategoryID(string categoryID)
        {
            var productModels = db.ProductModels.Where(s => s.CategoryId == categoryID);
            return productModels.ToList();
        }
    }
}