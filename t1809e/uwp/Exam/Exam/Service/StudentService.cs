using Exam.Helper;
using Exam.Models;
using SQLitePCL;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam.Service
{
    class StudentService
    {
        public bool Create(Student student)
        {
            var sqlConnection = SQLiteHelper.CreateInstance().SQLiteConnection;
            var sqlCommandString = "INSERT INTO Student (RoleNumber, Name, Status) values (?,?,?)";
            using (var stt = sqlConnection.Prepare(sqlCommandString))
            {
                stt.Bind(1, student.RoleNumber);
                stt.Bind(2, student.Name);
                stt.Bind(3, student.Status);
                var result = stt.Step();
                return result == SQLiteResult.OK;
            }
        }        

        public List<Student> Find(int status)
        {
            List<Student> list = new List<Student>();

            var sqlConnection = SQLiteHelper.CreateInstance().SQLiteConnection;
            var sqlCommandString = "select * from Student where Status = ?";
            using (var stt = sqlConnection.Prepare(sqlCommandString))
            {
                stt.Bind(1, status);
                while (SQLiteResult.ROW == stt.Step())
                {
                    var RoleNumber = (string)stt[0];
                    var Name = (string)stt[1];
                    var Status = stt[2].ToString();

                    var student = new Student()
                    {
                        RoleNumber = RoleNumber,
                        Name = Name,
                        Status = Int32.Parse(Status),
                    };
                    list.Add(student);
                }
                return list;
            }
        }

        public bool ChangeStatus(int status, string roleNumber)
        {
            
            var sqlConnection = SQLiteHelper.CreateInstance().SQLiteConnection;
            var sqlCommandString = "UPDATE Student SET Status = ? WHERE RoleNumber = ? ";
            using (var stt = sqlConnection.Prepare(sqlCommandString))
            {
                stt.Bind(1, status);
                stt.Bind(2, roleNumber);

                var result = stt.Step();
                return result == SQLiteResult.OK;
            }
        }
    }
}
