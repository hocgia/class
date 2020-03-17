using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Web;

namespace practical.Models
{
    public class MSSQLContext : DbContext
    {
        public MSSQLContext() : base("MSSQLConnectionString")
        {

        }

        public DbSet<Employee> Employees { get; set; }
    }
}