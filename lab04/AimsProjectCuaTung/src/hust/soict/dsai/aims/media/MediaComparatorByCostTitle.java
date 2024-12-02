package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<MediaTungNM >{
    public MediaComparatorByCostTitle() {

    }
    
    @Override
    public int compare(MediaTungNM m1, MediaTungNM m2) {
        return Comparator.comparing((MediaTungNM m) -> -m.getPrice())
                .thenComparing(MediaTungNM::getTitle)
                .compare(m1, m2);
    }
}
