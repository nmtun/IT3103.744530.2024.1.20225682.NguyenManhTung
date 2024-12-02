package hust.soict.dsai.aims.media;

public class TrackTungNM implements PlayableTungNM{
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public TrackTungNM() {
        super();
    }

    public TrackTungNM(String title) {
        super();
        this.title = title;
    }

    public TrackTungNM(String title, int length) {
        super();
        this.title = title;
        this.length = length;
    }

    public void play() {
        System.out.println("Track playing is: " + this.getTitle());
        System.out.println("Track length is: " + this.getLength());
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof TrackTungNM)) return false;
        // 2 track items are considered as indentical if thay same title
        return (((TrackTungNM) o).getTitle().equals(title) && ((TrackTungNM) o).getLength() == length);
    }
}
