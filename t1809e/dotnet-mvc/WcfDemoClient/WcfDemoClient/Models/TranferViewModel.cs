using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WcfDemoClient.Models
{
    public class TranferViewModel
    {
        [System.ComponentModel.DisplayName("Customer Code")]
        public string SCode { get; set; }
        [System.ComponentModel.DisplayName("Receiver Code")]
        public string RCode { get; set; }
        [System.ComponentModel.DisplayName("Amount")]
        public int Amount { get; set; }
    }
}