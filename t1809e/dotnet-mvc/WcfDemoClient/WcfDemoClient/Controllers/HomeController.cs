using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using WcfDemoClient.Models;
using WcfDemoClient.UserServiceReference;

namespace WcfDemoClient.Controllers
{
    public class HomeController : Controller
    {
        private static string Code;
        private static AccountType Account;
        public ActionResult Index()
        {
            return View();
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Index(string code, string password)
        {
            var client = new UserServiceReference.UserServiceClient();
            var rs = client.GetAccount(code, password);
            if (rs != null)
            {
                Account = rs;
                return RedirectToAction("Tranfer");
            }
            else
            {
                ViewBag.Error = "Login error";
                return View();
            }
        }

        public ActionResult Tranfer()
        {
            ViewBag.Message = Account.UserName;
            ViewBag.Code = Account.Code;
            ViewBag.Blance = Account.Blance;
            return View(new TranferViewModel() { SCode = Account.Code });
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Tranfer(string SCode, string RCode, int Amount)
        {
            var client = new UserServiceReference.UserServiceClient();
            var rs = client.TransferMoney(SCode, RCode, Amount);
            if (rs)
            {
                ViewBag.Message = "Success";
                return View();
            }
            else
            {
                ViewBag.Message = "Error";
                return View();
            }
        }
    }
}