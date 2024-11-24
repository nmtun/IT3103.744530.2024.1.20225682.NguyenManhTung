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

    public void setTitleNmt(String title) {
        this.title = title;
    }

    public String getCategoryNmt() {
        return category;
    }

    public void setCategoryNmt(String category) {
        this.category = category;
    }

    public String getAuthorNmt() {
        return author;
    }

    public void setAuthorNmt(String author) {
        this.author = author;
    }

    public int getLengthNmt() {
        return length;
    }

    public void setLengthNmt(int length) {
        this.length = length;
    }

    public float getPriceNmt() {
        return price;
    }

    public void setPriceNmt(float price) {
        this.price = price;
    }

    private static int nbDVDTungNM = 0;
    private int id;

    public int getIdNmt() {
        return id;
    }

    //set id 
    public DVDTungNM() {
        nbDVDTungNM++;
        this.id = nbDVDTungNM;
    }

    // Create DVD
    public DVDTungNM(String title) { //by title
        this(); // khởi tạo mặc định để set ID
        this.title = title;             
    }

    public DVDTungNM(String title, String category, float price) { //by title, category and price
        this();
        this.title = title; 
        this.category = category;
        this.price = price;
    }

    public DVDTungNM(String title, String category, float price, String author) { //by title, category, price and author
        this();
        this.title = title; 
        this.category = category;
        this.price = price;
        this.author = author;
    }

    public DVDTungNM(String title, String category, float price, String author, int length) { //by title, category, price, author and length
        this();
        this.title = title; 
        this.category = category;
        this.price = price;
        this.author = author;
        this.length = length;
    }

    // method check title matching    
    public boolean isMatchNmt(String title) {
       if(this.title == null) {
            return false;
       }
       return this.title.equalsIgnoreCase(title);
    }
}
