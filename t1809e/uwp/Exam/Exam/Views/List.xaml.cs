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
using Exam.Service;
using Exam.Models;

// The Blank Page item template is documented at https://go.microsoft.com/fwlink/?LinkId=234238

namespace Exam.Views
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class List : Page
    {
        public List()
        {
            this.InitializeComponent();
            GetAll();
        }

        private void GetAll()
        {
            var StudentService = new StudentService();
            var result = StudentService.Find(1);
            if (result != null)
            {
                ListView_Students.ItemsSource = result;
            }
        }

        private void BackToMaster_HyperlinkButton_Click(object sender, RoutedEventArgs e)
        {
            Frame rootFrame = Window.Current.Content as Frame;
            rootFrame.Navigate(typeof(Master));
        }

        private void SongData_Select(object sender, SelectionChangedEventArgs e)
        {
            var StudentService = new StudentService();
            
            string typeName = e.AddedItems[0].ToString();
            switch (typeName)
            {
                case "Deleted":
                    var result = StudentService.Find(0);
                    if (result != null)
                    {
                        ListView_Students.ItemsSource = null;
                        ListView_Students.ItemsSource = result;
                    }
                    break;
                case "Active":
                    var result2 = StudentService.Find(1);
                    if (result2 != null)
                    {
                        ListView_Students.ItemsSource = null;
                        ListView_Students.ItemsSource = result2;
                    }
                    break;
            }
        }

        private void List_ItemClick(object sender, ItemClickEventArgs e)
        {
            var student = e.ClickedItem as Student;
            var StudentService = new StudentService();
            var status = 0;
            if(student.Status == 1)
            {
                status = 0;
            }
            else if (student.Status == 0)
            {
                status = 1;
            }
            StudentService.ChangeStatus(status, student.RoleNumber);

        }
    }
}
