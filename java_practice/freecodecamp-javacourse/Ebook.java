public class Ebook extends Book{
    private String format;

    Ebook(String title, String author, int pageCount, String format){
        super(title,author,pageCount);

        this.format = format;
    }

    public String getFormat(){
        return this.format;
    }
}
