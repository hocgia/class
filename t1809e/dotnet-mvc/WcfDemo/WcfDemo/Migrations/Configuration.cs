namespace WcfDemo.Migrations
{
    using System;
    using System.Data.Entity;
    using System.Data.Entity.Migrations;
    using System.Linq;

    internal sealed class Configuration : DbMigrationsConfiguration<WcfDemo.Model.ApplicationDbContext>
    {
        public Configuration()
        {
            AutomaticMigrationsEnabled = false;
        }

        protected override void Seed(WcfDemo.Model.ApplicationDbContext context)
        {
            context.Accounts.AddOrUpdate(x => x.Code,
                new AccountType() { Code = "1", UserName = "Trung", Password = "1234567", Blance = 10000 },
                new AccountType() { Code = "2", UserName = "Tung", Password = "1234567", Blance = 10000 },
                new AccountType() { Code = "3", UserName = "Hung", Password = "1234567", Blance = 10000 }
            );
        }
    }
}
