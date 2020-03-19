using assignment_shop.DAO;
using assignment_shop.Models;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Mvc;

namespace assignment_shop.Controllers
{
    public class HomeController : Controller
    {
        private ApplicationDbContext db = new ApplicationDbContext();
        private ProductDAO productDAO = new ProductDAO();
        private CategoryDAO categoryDAO = new CategoryDAO();

        //[HttpGet]
        //public ActionResult Index(string category, string keyword)
        //{
        //    IEnumerable<ProductModels> products;
        //    var categories = categoryDAO.GetAll();

        //    if (String.IsNullOrEmpty(keyword))
        //    {
        //        keyword = "";
        //    }

        //    ViewBag.Category = category;
        //    ViewBag.Keyword = keyword;

        //    if (String.IsNullOrEmpty(category))
        //    {
        //        products = productDAO.FindByName(keyword);
        //    }
        //    else
        //    {
        //        products = productDAO.FindByCategoryIDAndKeyword(category, keyword);
        //    }

        //    var productCategory = new ProductCategory()
        //    {
        //        Products = products,
        //        Categories = categories
        //    };
        //    return View(productCategory);
        //}

        [HttpGet]
        public ActionResult Index(string category)
        {
            ViewBag.Keyword = "";

            var categories = categoryDAO.GetAll();
            IEnumerable<ProductModels> products;
            if (String.IsNullOrEmpty(category))
            {
                products = db.ProductModels.Include(p => p.Category).ToList();
            }
            else
            {
                products = productDAO.FindByCategoryID(category);
            }
            var productCategory = new ProductCategory()
            {
                Products = products,
                Categories = categories
            };
            return View(productCategory);
        }

        [HttpPost]
        public ActionResult Index(string keyword, string hidden)
        {
            ViewBag.Keyword = keyword;
            var categories = categoryDAO.GetAll();
            var products = productDAO.FindByName(keyword);
            var productCategory = new ProductCategory()
            {
                Products = products,
                Categories = categories
            };
            return View(productCategory);
        }

        public ActionResult About()
        {
            ViewBag.Message = "Your application description page.";

            return View();
        }

        public ActionResult Contact()
        {
            ViewBag.Message = "Your contact page.";

            return View();
        }
    }
}