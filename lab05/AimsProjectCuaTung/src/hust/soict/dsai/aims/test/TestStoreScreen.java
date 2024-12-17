package hust.soict.dsai.aims.test;

import javax.swing.*;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.*;

public class TestStoreScreen {
    public static void main(String[] args) {
        StoreTungNM store = new StoreTungNM();

        MediaTungNM m1 = new DVDTungNM("Fujio", "Doraemon", "Anime",15,  15f);
        MediaTungNM m2 = new BookTungNM(0, "Why we sleep", "Scientific", 9f);
        MediaTungNM m3 = new CompactDiscTungNM(1, "Gao ranger", "Super sentai", 20f, 2, "TungNM");
        MediaTungNM m4 = new DiscTungNM(1, "Conan", "Anime", 50f, 10, "Khanh");

        store.addMediaTungNM(m1);
        store.addMediaTungNM(m2);
        store.addMediaTungNM(m3);
        store.addMediaTungNM(m4);

        StoreScreenTungNM storeScreen = new StoreScreenTungNM(store);

        storeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
