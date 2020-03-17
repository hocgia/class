using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(assignment_shop.Startup))]
namespace assignment_shop
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
