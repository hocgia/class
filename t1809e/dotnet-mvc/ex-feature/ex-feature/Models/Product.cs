using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace ex_feature.Models
{
    public class Product
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string Description { get; set; }
        public string Content { get; set; }
        public double Price { get; set; }
        public string Thumbnails { get; set; }
        [Display(Name = "Created At")]
        public DateTime CreatedAt { get; set; }
    }
}