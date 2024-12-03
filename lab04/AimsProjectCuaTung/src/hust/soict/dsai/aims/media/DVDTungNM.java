package hust.soict.dsai.aims.media;

public class DVDTungNM extends DiscTungNM implements PlayableTungNM{
    private static int nbDVDTungNM = 0;

    public DVDTungNM(String title) {
        super();
        setTitle(title);
        nbDVDTungNM++;
        setId(nbDVDTungNM);
    }

    public DVDTungNM(String title, float price) {
        super(title, price);
    }

    public DVDTungNM(String title, String category, float price) {
        this(title);
        setCategory(category);
        setPrice(price);
	}

    public DVDTungNM(String director, String title, String category, float price) {
        this(title, category, price);
        setDirector(director);
	}

    public DVDTungNM(String title, String category, String director, int length, float price) {
       this(director, category, title, price);
       setLength(length);
    }

    public void play() {
        System.out.println("Plying DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public int compareTo(MediaTungNM o) {
        // So sánh tiêu đề trước
        int titleCompare = getTitle().compareTo(o.getTitle());
        if (titleCompare != 0) return titleCompare;

        // So sánh giá nếu tiêu đề bằng nhau
        int priceCompare = Double.compare(getPrice(), o.getPrice());
        if (priceCompare != 0) return priceCompare;

        // So sánh thể loại khi tiêu đề và giá bằng nhau
        return getCategory().compareTo(o.getCategory());
    }

}
