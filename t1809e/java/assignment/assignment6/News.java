import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

public class News implements INews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float AverageRate;

    int[] RateList = new int[3];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public int[] getRateList() {
        return RateList;
    }

    public void setRateList(int[] rateList) {
        RateList = rateList;
    }

    @Override
    public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("PublishDate: " + getPublishDate());
        System.out.println("Author: " + getAuthor());
        System.out.println("Content: " + getContent());
        System.out.println("AverageRate: " + getAverageRate());
    }

    public void calculate(){
        int sum = 0;
        for (int i:getRateList()) {
            sum += i;
        }
        this.AverageRate = (float) sum/getRateList().length;
    }
}
