package hust.soict.dsai.aims.media;

public class DiscTungNM extends MediaTungNM{
    private int length;
    private String director;

    public DiscTungNM() {
        //TODO Auto-generated constructor stub
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public DiscTungNM(String title, float price) {
        super(title, price);
    }
    
    public DiscTungNM(int id, String title, String category, float price, int length, String director) {
        super(id, title, category, price);
        this.length = length;
        this.director = director;
    }
}
