using System;
using System.Linq;

namespace assignment_3_new
{
    public class News: INews
    {
        public int Id { get; set; }

        public string Title { get; set; }

        public string PublishDate { get; set; }

        public string Author { get; set; }

        public string Content { get; set; }
        
        public int[] RateList { get; set; }

        public float AverageRate { get; set; }
        
        public News()
        {
        }

        public News(int id, string title, string publishDate, string author, string content, int[] rateList)
        {
            Id = id;
            Title = title;
            PublishDate = publishDate;
            Author = author;
            Content = content;
            RateList = rateList;
        }

        public void Display()
        {
            Console.WriteLine("Title: {0, 10} | PublishDate: {1, 10} | Author: {2, 10} | Content: {3, 10} | AverageRate: {4, 10}", Title, PublishDate, Author, Content, AverageRate);
        }

        public void Calculate()
        {
            var sumRate = RateList.Sum();
            AverageRate = sumRate / RateList.Length;
        }
    }
}