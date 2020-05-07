﻿namespace WcfDemo.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class init : DbMigration
    {
        public override void Up()
        {
            CreateTable(
                "dbo.AccountTypes",
                c => new
                    {
                        Code = c.String(nullable: false, maxLength: 128),
                        Password = c.String(),
                        UserName = c.String(),
                        Blance = c.Int(nullable: false),
                    })
                .PrimaryKey(t => t.Code);
            
        }
        
        public override void Down()
        {
            DropTable("dbo.AccountTypes");
        }
    }
}
