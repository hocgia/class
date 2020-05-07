using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WcfDemoClient.Models
{
    public class LoginViewModel
    {
        [System.ComponentModel.DisplayName("Customer Code")]
        public string Code { get; set; }
        [System.ComponentModel.DisplayName("Security Code")]
        public string Password { get; set; }
    }
}