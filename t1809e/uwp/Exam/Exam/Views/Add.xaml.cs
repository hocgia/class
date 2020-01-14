using Exam.Models;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;
using Exam.Views;
using Exam.Service;

// The Blank Page item template is documented at https://go.microsoft.com/fwlink/?LinkId=234238

namespace Exam.Views
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class Add : Page
    {
        public Add()
        {
            this.InitializeComponent();
        }

        private void BackToMaster_HyperlinkButton_Click(object sender, RoutedEventArgs e)
        {
            Frame rootFrame = Window.Current.Content as Frame;
            rootFrame.Navigate(typeof(Master));
        }

        private void AddStudent_Button_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                LoadingProgressRing.IsActive = true;
                Add_Error.Visibility = Visibility.Collapsed;

                var name = this.Name.Text;
                var roleNumber = this.RoleNumber.Text;

                var student = new Student()
                {
                    RoleNumber = roleNumber,
                    Name = name,
                    Status = 1
                };
                var errors = student.ValidateStudent();
                if (errors.Count > 0)
                {
                    var error = "";
                    if (errors.ContainsKey("Error"))
                    {
                        error = errors["Error"];
                    }
                    Add_Error.Visibility = Visibility.Visible;
                    Add_Error.Text = error;
                }
                else
                {
                    Add_Error.Visibility = Visibility.Collapsed;
                    var StudentService = new StudentService();
                    var resultCreate = StudentService.Create(student);

                    //if (resultCreate)
                    //{
                        // success
                        Frame rootFrame = Window.Current.Content as Frame;
                        rootFrame.Navigate(typeof(Master));
                    //}
                    //else
                    //{
                    //    Contact_Error.Visibility = Visibility.Visible;
                    //    Contact_Error.Text = "Create Error";
                   // }
                }
            }
            finally
            {
                LoadingProgressRing.IsActive = false;
            }
        }
    }
}
