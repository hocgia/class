using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using WcfDemo.Model;

namespace WcfDemo
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IUserService" in both code and config file together.
    [ServiceContract]
    public interface IUserService
    {
        [OperationContract]
        AccountType GetAccount(string code, string password);

        [OperationContract]
        bool TransferMoney(string sCode, string rCode, int amount);
    }

    [DataContract]
    public class AccountType
    {
        string code = "";
        string password = "";
        string username = "";
        int blance = 0;

        [DataMember]
        [Key]
        public string Code
        {
            get { return code; }
            set { code = value; }
        }

        [DataMember]
        public string Password
        {
            get { return password; }
            set { password = value; }
        }

        [DataMember]
        public string UserName
        {
            get { return username; }
            set { username = value; }
        }

        [DataMember]
        public int Blance
        {
            get { return blance; }
            set { blance = value; }
        }
    }
}
