using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using WcfDemo.Model;

namespace WcfDemo
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "UserService" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select Service1.svc or UserService.svc.cs at the Solution Explorer and start debugging.
    public class UserService : IUserService
    {       
        private ApplicationDbContext db = new ApplicationDbContext();
        public AccountType GetAccount(string code, string password)
        {
            var account = db.Accounts.Where(r => r.Code == code).Where(r => r.Password == password).FirstOrDefault();
            return account;
        }

        public bool TransferMoney(string sCode, string rCode, int amount)
        {
            var sAccount = db.Accounts.Where(r => r.Code == sCode).FirstOrDefault();
            if (sAccount.Blance >= amount)
            {
                var rAccount = db.Accounts.Where(r => r.Code == rCode).FirstOrDefault();
                if (rAccount != null)
                {
                    sAccount.Blance -= amount;
                    rAccount.Blance += amount;
                    db.Entry(sAccount).State = EntityState.Modified;
                    db.SaveChanges();
                    db.Entry(rAccount).State = EntityState.Modified;
                    db.SaveChanges();
                    return true;
                }
            }
            return false;
        }
    }
}
