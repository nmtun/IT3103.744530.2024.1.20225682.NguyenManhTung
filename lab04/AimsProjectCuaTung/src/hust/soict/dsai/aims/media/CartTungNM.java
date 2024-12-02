package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartTungNM {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<MediaTungNM> itemsOrdered = new ArrayList<MediaTungNM>();

    //add item
	public void addMediaTungNM(MediaTungNM product) {
	    if(!itemsOrdered.contains(product) && itemsOrdered.size() < MAX_NUMBERS_ORDERED ) {
	        itemsOrdered.add(product);
	        System.out.println("Media has been added");
	    } else {
	        System.out.println("Media existed or your cart is full, please check again");
	    }
	}

    //remove item 
    public void removeMediaTungNM(int choice) {
        if(itemsOrdered.contains(choice)) {
            itemsOrdered.remove(choice);
            System.out.println("Media has ben removed");
        } else {
            System.out.println("Media not exits");
        }
    }

    //caculate total price
    public float totalPrice(){
        float total = 0;
        for(int i=0; i<itemsOrdered.size(); i++){
            total += itemsOrdered.get(i).getPrice();
        }
        return total;
    }

    // print the list of ordered items of a cart
    public void printItemsInCartNMT() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(int i=0; i<itemsOrdered.size(); i++) {
            MediaTungNM dvd = itemsOrdered.get(i);
            System.out.printf("%d. %s - %d: %.2f$ \n",
                                    i+1, dvd.getTitle(), dvd.getCategory(), dvd.getPrice() );
        }

        float totalCost = totalPrice();
        System.out.printf("Total cost: %.2f $ \n", totalCost);
        System.out.println("***************************************************");
    }

    // search by ID
    public MediaTungNM searchByIdNmt(int id) {
        int n = itemsOrdered.size();
        for(int i=0; i<n; i++) {
            if(itemsOrdered.get(n).getId() == id) return itemsOrdered.get(i);
        }
        return null;
    }

    //search by title 
    public MediaTungNM searchByTitleNmt(String title) {
        int n = itemsOrdered.size();
        for(int i=0; i<n; i++) {
            if(itemsOrdered.get(n).isMatchNmt(title)) {
               return itemsOrdered.get(i);
            } 
        }
        return null;
    }

    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, MediaTungNM.COMPARE_BY_TITLE_COST);
    }

    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, MediaTungNM.COMPARE_BY_COST_TITLE);
    }

    public void emptyMediaTungNM() {
	    for (int i = 0; i < itemsOrdered.size(); i++) {
	    	itemsOrdered.clear();
	    }
	}
}
