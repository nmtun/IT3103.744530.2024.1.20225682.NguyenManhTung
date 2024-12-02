package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<MediaTungNM> {
    public MediaComparatorByTitleCost() {

    }

    public int compare(MediaTungNM m1, MediaTungNM m2) {
        return Comparator.comparing(MediaTungNM::getTitle)
                .thenComparing((m1Inner, m2Inner) -> Float.compare(m2Inner.getPrice(), m1Inner.getPrice()))
                .compare(m1, m2);
    }
}
