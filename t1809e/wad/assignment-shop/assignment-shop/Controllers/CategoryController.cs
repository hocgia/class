﻿using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Mvc;
using assignment_shop.Models;

namespace assignment_shop.Controllers
{
    public class CategoryController : Controller
    {
        private ApplicationDbContext db = new ApplicationDbContext();

        // GET: Category
        public ActionResult Index()
        {
            return View(db.CategoryModels.ToList());
        }

        // GET: Category/Details/5
        public ActionResult Details(string id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            CategoryModels categoryModels = db.CategoryModels.Find(id);
            if (categoryModels == null)
            {
                return HttpNotFound();
            }
            return View(categoryModels);
        }

        // GET: Category/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: Category/Create
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "Id,Name,Description,CreateAt,UpdateAt,DeleteAt")] CategoryModels categoryModels)
        {
            if (ModelState.IsValid)
            {
                db.CategoryModels.Add(categoryModels);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            return View(categoryModels);
        }

        // GET: Category/Edit/5
        public ActionResult Edit(string id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            CategoryModels categoryModels = db.CategoryModels.Find(id);
            if (categoryModels == null)
            {
                return HttpNotFound();
            }
            return View(categoryModels);
        }

        // POST: Category/Edit/5
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "Id,Name,Description,CreateAt,UpdateAt,DeleteAt")] CategoryModels categoryModels)
        {
            if (ModelState.IsValid)
            {
                db.Entry(categoryModels).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(categoryModels);
        }

        // GET: Category/Delete/5
        public ActionResult Delete(string id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            CategoryModels categoryModels = db.CategoryModels.Find(id);
            if (categoryModels == null)
            {
                return HttpNotFound();
            }
            return View(categoryModels);
        }

        // POST: Category/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(string id)
        {
            CategoryModels categoryModels = db.CategoryModels.Find(id);
            db.CategoryModels.Remove(categoryModels);
            db.SaveChanges();
            return RedirectToAction("Index");
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }
    }
}
