package hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.List;


import hust.soict.dsai.aims.media.*;

public class testToString {
    public static void main(String[] args) {
        List<MediaTungNM> list = new ArrayList<>();
        list.add(new DVDTungNM("Doraemon", "Anime", "Fujio", 15f));
        //list.add(new BookTungNM(0, "Why we sleep", "Scientific", 9f));
        //list.add(new CompactDiscTungNM(1, "Gao ranger", "Super sentai", 20f, 2, "TungNM"));

        for(MediaTungNM item: list) {
            System.out.println(item.toString());
        }
    }
}
