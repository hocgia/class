using assignment_shop.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace assignment_shop.DAO
{
    public class CategoryDAO
    {
        private ApplicationDbContext db = new ApplicationDbContext();

        public List<CategoryModels> GetAll()
        {
            var categories = db.CategoryModels.ToList();
            return categories;
        }
    }
}