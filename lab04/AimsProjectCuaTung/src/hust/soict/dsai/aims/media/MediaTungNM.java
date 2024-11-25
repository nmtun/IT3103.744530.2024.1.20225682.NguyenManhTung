package hust.soict.dsai.aims.media;

public class MediaTungNM {
    private int id;
    private String title;
    private String category;
    private float price;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public MediaTungNM(int id2, String title2, String category2, float price2) {}

    public void addMedia(String title, String category, float price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public void addMedia(int id, String title, String category, float price) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.price = price;
    }
}
