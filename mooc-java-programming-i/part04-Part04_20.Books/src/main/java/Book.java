public class Book {

    private String title;
    private int pages;
    private  int publication;

    public Book(String title, int pages, int publication) {
        this.title = title;
        this.pages = pages;
        this.publication = publication;

    }

    @Override
    public String toString() {

        return String.format("%s, %d pages, %d",title,pages,publication);
    }

    public String printName(){
        return title;
    }

}
