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

        [HttpGet]
        public ActionResult Index()
        {
            var productModels = db.ProductModels.Include(p => p.Category);
            return View(productModels.ToList());
        }

        [HttpPost]
        public ActionResult Index(string keyword)
        {
            var producsts = productDAO.FindByName(keyword);
            return View(producsts);
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