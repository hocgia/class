using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Web;

namespace WcfDemo.Model
{
    public class ApplicationDbContext : DbContext
    {
        public ApplicationDbContext() : base("WcfDemoContext")
        {
        }

        public DbSet<AccountType> Accounts { get; set; }
    }
}