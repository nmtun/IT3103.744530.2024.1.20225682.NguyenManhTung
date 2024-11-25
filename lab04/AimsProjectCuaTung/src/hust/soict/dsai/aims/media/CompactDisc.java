package hust.soict.dsai.aims.media;

public class CompactDisc extends MediaTungNM{
    private int length;
    private String director;

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

    public CompactDisc(int id, String title, String category, float price, int length, String director) {
        super(id, title, category, price);
        this.length = length;
        this.director = director;
    }

}
