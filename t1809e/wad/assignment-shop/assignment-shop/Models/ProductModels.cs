﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Web;

namespace assignment_shop.Models
{
    public class ProductModels:ModelUtils
    {
        public string Id { get; set; }
        public string Name { get; set; }
        public string Description { get; set; }
        public string Thumbnail { get; set; }
        public string Price { get; set; }
        [ForeignKey("Category")]
        public string CategoryId { get; set; }
        public virtual CategoryModels Category { get; set; }
    }
}