package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class StoreNmt {
    public static final int MAX_DVD = 50;
    private List<MediaTungNM> itemsInNmtStore = new ArrayList<MediaTungNM>();
    private int qtyOrdered = 0;

    public int getQtyOrderedNmt() {
        return qtyOrdered;
    }

    public void setQtyOrderedNmt(int n) {
        qtyOrdered += n;
    }

    public void addMediaTungNM(MediaTungNM product) {
        if(!itemsInNmtStore.contains(product) && itemsInNmtStore.size() < 50) {
            itemsInNmtStore.add(product);
            System.out.println("The media " + product.getTitle() + " has been added in the Nmtung store");
        } else {
            System.out.println("The Nmtung store is almost full or media exits, please check again");
        }
    }

    public void removeMediaTungNM(String title) {
        if(itemsInNmtStore.contains(title)) {
            itemsInNmtStore.remove(title);
            System.out.println("Media has been removed");
        } else {
            System.out.println("Media not exits");
        }
    }

    public void printItemsInStore() {
        System.out.println("***********************CART***********************");
        System.out.println("Available Items:");
        for(int i=0; i<itemsInNmtStore.size(); i++) {
            MediaTungNM dvd = itemsInNmtStore.get(i);
            System.out.printf("%d. %s - %s: %.2f$ \n",i+1,
            		dvd.getTitle(), dvd.getCategory(), dvd.getPrice() );
        }
        System.out.println("***************************************************");
    }

    // Search by title 
    public MediaTungNM searchByTitle(String title) {
        int n = itemsInNmtStore.size();
        for (int i = 0; i < n; i++) {
            if (itemsInNmtStore.get(i).isMatchNmt(title)) {
//                System.out.println(title + " - " + itemsInStore.get(i).getCost());
                return itemsInNmtStore.get(i); // Return the matching media
            }
        }
        return null; // Return null if no match is found
    }
    
}
