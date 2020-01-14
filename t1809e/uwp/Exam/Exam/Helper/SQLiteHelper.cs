using SQLitePCL;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam.Helper
{
    class SQLiteHelper
    {
        private static SQLiteHelper _instance;
        public SQLiteConnection SQLiteConnection { get; set; }

        public static SQLiteHelper CreateInstance()
        {
            if (_instance == null)
            {
                _instance = new SQLiteHelper();
            }
            return _instance;
        }

        public SQLiteHelper()
        {
            SQLiteConnection = new SQLiteConnection(Constants.DATABASE_NAME);
            CreateTables();
        }

        private void CreateTables()
        {
            CreateStudentTable();
        }

        private void CreateStudentTable()
        {
            var sql = @"Create table if not exists Student (RoleNumber  varchar(100), Name varchar(100), Status integer)";
            using (var statement = SQLiteConnection.Prepare(sql))
            {
                statement.Step();
            }
        }
    }
}
