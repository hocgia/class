using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam.Models
{
    class Student
    {
        public string RoleNumber { get; set; }
        public string Name { get; set; }
        public int Status { get; set; }

        public Dictionary<string, string> ValidateStudent()
        {
            var errors = new Dictionary<string, string>();

            if (string.IsNullOrEmpty(this.Name))
            {
                errors.Add("Error", "Name not empty!");
            }
            
            return errors;
        }
    }
}
