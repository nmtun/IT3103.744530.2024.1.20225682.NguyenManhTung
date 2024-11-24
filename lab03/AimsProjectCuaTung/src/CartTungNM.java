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

	//thêm DVD với tham số đầu vào là một mảng các đĩa DVD
    public void addDVDNmt(DVDTungNM[] listDVD) {
        for(DVDTungNM disc: listDVD) {
            addDVDNmt(disc);
        }
        System.out.println("DVD has been added in your cart");
    }

    //thêm DVD với lượng đầu vào là tùy ý 
    public void addDVDNmtung(DVDTungNM... listDVD) {
        for(DVDTungNM disc: listDVD) {
            addDVDNmt(disc);
        }
        System.out.println("DVD has been added in your cart");
    }

    //Overloading by differing the number of parameters
    public void addDVDNmt(DVDTungNM dvd1, DVDTungNM dvd2) {
        addDVDNmt(dvd1);   
        addDVDNmt(dvd2);
        System.out.println("DVD has been added in your cart");
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
            total += itemsOrdered[i].getPriceNmt();
        }
        return total;
    }

    //print id + cart list
    public void listIdTungNM() {
        for(int i=0 ; i<qtyOrdered; i++) {
            System.out.println("ID: " + itemsOrdered[i].getIdNmt() + " - " + itemsOrdered[i].getTitleNmt());
        }
    }

    // print the list of ordered items of a cart
    public void printItemsInCartNMT() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(int i=0; i<qtyOrdered; i++) {
            DVDTungNM dvd = itemsOrdered[i];
            System.out.printf("%d. DVD -  %s - %s - %s - %d: %.2f$ \n",
                                    i+1, dvd.getTitleNmt(), dvd.getCategoryNmt(), dvd.getAuthorNmt(), dvd.getLengthNmt(), dvd.getPriceNmt() );
        }

        float totalCost = totalPrice();
        System.out.printf("Total cost: %.2f $ \n", totalCost);
        System.out.println("***************************************************");
    }

    // phương thức check khi khởi tạo đối tượng nhưng chưa có giá trị ->> Updating
    public void checkNullValue(DVDTungNM... listDVD) {
        for(DVDTungNM dvd: listDVD){
            if(dvd.getTitleNmt() == null) dvd.setTitleNmt("\"Updating\"");
            if(dvd.getCategoryNmt() == null) dvd.setCategoryNmt("\"Updating\"");
            if(dvd.getAuthorNmt() == null) dvd.setAuthorNmt("\"Updating\"");
        }
    }

    // search by ID
    public boolean searchByIdNmt(int id) {
        int n = qtyOrdered;
        for(int i=0; i<n; i++) {
            if(itemsOrdered[i].getIdNmt() == id) return true;
        }
        return false;
    }

    //search by title 
    public void searchByTitleNmt(String title) {
        int n = qtyOrdered;
        boolean check = false;
        for(int i=0; i<n; i++) {
            if(itemsOrdered[i].isMatchNmt(title)) {
                System.out.println("Your cart has a DVD as title name is: " + title);
                check = true;
            } 
        }
        if(!check) {
            System.out.println("No data is matching");
        }
    }
}
