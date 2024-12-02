package hust.soict.dsai.aims.media;

public class DVDTungNM extends DiscTungNM implements PlayableTungNM {
    private static int nbDVDTungNM = 0;
    private String director;
    private int length;

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

    public DVDTungNM(String title) {
        super();
        setTitle(title);
        nbDVDTungNM++;
        setId(nbDVDTungNM);
    }

    public DVDTungNM(String title, String category, float price) {
        super();
        setTitle(title);
        setCategory(category);
        setPrice(price);
        nbDVDTungNM++;
        setId(nbDVDTungNM);
    }

    public DVDTungNM(String title, String category, String director, float cost) {
		super();
        setTitle(title);
        setCategory(category);
        setDirector(director);
        setPrice(cost);
        nbDVDTungNM++;
        setId(nbDVDTungNM);
	}

    public DVDTungNM(String title, String category, String director, int length, float price) {
        super();
        setTitle(title);
        setCategory(category);
        setDirector(director);
        setLength(length);
        setPrice(price);
        nbDVDTungNM++;
        setId(length);
    }

    public void play() {
        System.out.println("DVD playing is: " + this.getTitle());
        System.out.println("DVD length is: " + this.getLength());
    }

    @Override
    public String toString() {
        return "DVDTungNM{" +
                "director='" + director + '\'' +
                ", length=" + length +
                '}' + super.toString();
    }
}
