package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDiscTungNM extends DiscTungNM implements PlayableTungNM{
    private String artist;
    private List<TrackTungNM> tracksNmtung = new ArrayList<TrackTungNM>();

    public String getArtist() {
        return artist;
    }

    public CompactDiscTungNM() {
        super();
    }

    // create 
    public CompactDiscTungNM(int id, String title) {
        super();
        setId(id);
        setTitle(title);
    }

    public CompactDiscTungNM(int id, String title, String category) {
        super();
        setId(id);
        setTitle(title);
        setCategory(category);
    }

    public CompactDiscTungNM(int id, String title, String category, float price) {
        super();
        setId(id);
        setTitle(title);
        setCategory(category);
        setPrice(price);
    }

    public void addTrack(TrackTungNM track) {
        if(!tracksNmtung.contains(track)) {
            tracksNmtung.add(track);
            System.out.println("Track added successfully");
        } else {
            System.out.println(track + " already exist");
        }
    }

    public void removeTrack(TrackTungNM track) {
        if(tracksNmtung.contains(track)) {
            tracksNmtung.remove(track);
            System.out.println("Track have been removed");
        } else {
            System.out.println(track + " not exist");
        }
    }

    public int getLength() {
        int sumLength = 0;
        for(TrackTungNM track: tracksNmtung) {
            sumLength += track.getLength();
        }
        return sumLength;
    }

    public void play() {
        System.out.println("CD playing is: " + this.getTitle());
        System.out.println("CD length is: " + this.getLength());

        for(int i=1; i<=tracksNmtung.size(); i++) {
            System.out.println("Track: " + i);
            tracksNmtung.get(i).play(); 
        }
    }
}
