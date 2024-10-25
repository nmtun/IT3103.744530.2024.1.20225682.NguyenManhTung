public class CartTungNM {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DVDTungNM itemsOrdered[] = new DVDTungNM[MAX_NUMBERS_ORDERED];

    private int qtyOrdered = 0;

    //add item
    public void addDVDNmt(DVDTungNM disc) {
        if(qtyOrdered < 20) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("DVD has been added");
        } else {
            System.out.println("Your cart is full, can not added new item!");
        }
    }

    //remove item 
    public void removeDVDNmt(DVDTungNM disc) {
        for(int i=0; i<qtyOrdered; i++){
            if(itemsOrdered[i].getTitleNmt().equals(disc.getTitleNmt())){
                for(int j=i; j<qtyOrdered-1; j++){
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
            }
            qtyOrdered--;
            System.out.println("DVD has been removed");
            break;
        }
    }

    //caculate total price
    public float totalPrice(){
        float total = 0;
        for(int i=0; i<qtyOrdered; i++){
            total += itemsOrdered[i].getPrice();
        }
        return total;
    }
}
