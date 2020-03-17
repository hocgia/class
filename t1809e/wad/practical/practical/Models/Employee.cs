using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace practical.Models
{
    public class Employee
    {
        [DisplayName("Employee ID")]
        [Required]
        public string ID { get; set; }
        [DisplayName("Employee Name")]
        [Required]
        public string Name { get; set; }
        [Required]
        public string Department { get; set; }
        [Required]
        [RegularExpression("([0-9]+)")]
        public string Salary { get; set; }

    }
}