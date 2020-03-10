using ex_1_cart.Models;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace ex_1_cart.Controllers
{
    public class CartController : Controller
    {
        private static List<CartItem> _cart = new List<CartItem>();
        // GET: Cart
        public ActionResult Index()
        {
            return View("~/Views/Cart/Index.cshtml", _cart);
        }

        // POST: Cart/Add
        public ActionResult Add(string productId)
        {
            _cart.Add(new CartItem
            {
                ProductId = productId,
                Quantity = 1,
            });
            return View("~/Views/Cart/Index.cshtml", _cart);
        }

        public ActionResult Remove(string productId)
        {
            //_cart.RemoveAll(i => i.ProductId == productId);

            var index = _cart.FindIndex(i => i.ProductId == productId);
            if (index >= 0)
            {
                _cart.RemoveAt(index);
            }
            return View("~/Views/Cart/Index.cshtml", _cart);
        }

        public ActionResult Increase(string productId)
        {
            var index = _cart.FindIndex(i => i.ProductId == productId);
            if (index >= 0)
            {
                var oldItem = _cart[index];
                oldItem.Quantity = oldItem.Quantity + 1;
                _cart[index] = oldItem;
            }
            return View("~/Views/Cart/Index.cshtml", _cart);
        }

        public ActionResult Reduction(string productId)
        {
            var index = _cart.FindIndex(i => i.ProductId == productId);
            if (index >= 0)
            {
                var oldItem = _cart[index];
                if (oldItem.Quantity == 1)
                {
                    _cart.RemoveAt(index);
                } else if (oldItem.Quantity >= 2)
                {
                    oldItem.Quantity = oldItem.Quantity - 1;
                    _cart[index] = oldItem;
                }
            }
            return View("~/Views/Cart/Index.cshtml", _cart);
        }
    }
}