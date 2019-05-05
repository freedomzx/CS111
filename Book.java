public class Book
{
    private String title;
    private String author;
    private String tableOfContents = "";
    private int nextPage = 1;
    public Book(String one, String two)
    {
        title = one;
        author = two;
    }
    public void addChapter(String tit, int pages)
    {
        tableOfContents = "\n" + title + "..." + nextPage;
        nextPage+=pages;
    }
    public int getPages()
    {
        return nextPage-1;
    }
    public String getTableOfContents()
    {
        return tableOfContents;
    }
    public String toString()
    {
        return title + "\n" + author;
    }
}
