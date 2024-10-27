public class DVDTungNM {
    //các trường của lớp DVD
    private String title;
    private String category;
    private String author;
    private int length;
    private float price;

    //các phương thức của lớp DVD
    public String getTitleNmt() {
        return title;
    }

    public String getCategoryNmt() {
        return category;
    }

    public String getAuthorNmt() {
        return author;
    }

    public int getLengthNmt() {
        return length;
    }

    public float getPrice() {
        return price;
    }

    // Create DVD
    public DVDTungNM(String title) { //by title
        this.title = title;             
    }

    public DVDTungNM(String title, String category, float price) { //by title, category and price
        this.title = title; 
        this.category = category;
        this.price = price;
    }

    public DVDTungNM(String title, String category, float price, String author) { //by title, category, price and author
        this.title = title; 
        this.category = category;
        this.price = price;
        this.author = author;
    }

    public DVDTungNM(String title, String category, float price, String author, int length) { //by title, category, price, author and length
        this.title = title; 
        this.category = category;
        this.price = price;
        this.author = author;
        this.length = length;
    }
}
