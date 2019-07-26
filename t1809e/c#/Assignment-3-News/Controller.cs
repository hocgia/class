using System;
using System.Collections.Generic;

namespace assignment_3_new
{
    public class Controller
    {
        private static List<News> _newses = new List<News>();
        public void Create()
        {
            Console.WriteLine("Input Id:");
            var id = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Input Title");
            var title = Console.ReadLine();
            Console.WriteLine("Input Publish Date");
            var publishDate = Console.ReadLine();
            Console.WriteLine("Input Author");
            var author = Console.ReadLine();
            Console.WriteLine("Input Content");
            var content = Console.ReadLine();
            Console.WriteLine("Input Rate");
            var rateList = new int[3];
            for (var i = 0; i < 3; i++)
            {
                Console.WriteLine("{0}: ", i + 1);
                rateList[i] = Convert.ToInt32(Console.ReadLine());
            }
            var news = new News(id, title, publishDate, author, content, rateList);
            _newses.Add(news);
            Console.WriteLine("Create success!");
        }

        public void Read()
        {
            foreach (var news in _newses)
            {
                news.Display();
            }
        }

        public void AverageRate()
        {
            foreach (var news in _newses)
            {
                news.Calculate();
                news.Display();
            }
        }
    }
}