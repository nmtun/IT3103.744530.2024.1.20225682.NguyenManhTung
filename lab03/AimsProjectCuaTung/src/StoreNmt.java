public class StoreNmt {
    public static final int MAX_DVD = 50;
    private DVDTungNM itemsInNmtStore[] = new DVDTungNM[MAX_DVD];
    private int qtyOrdered = 0;

    public int getQtyOrderedNmt() {
        return qtyOrdered;
    }

    public void setQtyOrderedNmt(int n) {
        qtyOrdered += n;
    }

    public void addDVDNmtStore(DVDTungNM disc) {
        if(this.getQtyOrderedNmt() <= 50) {
            itemsInNmtStore[this.getQtyOrderedNmt()] = disc;
            setQtyOrderedNmt(1);
            System.out.println("The disc " + disc.getTitleNmt() + " has been added in the Nmtung store");
        } else {
            System.out.println("The Nmtung store is almost full");
        }
    }

    public void removeDVDNmtStore(DVDTungNM disc) {
        for(int i=0; i<qtyOrdered; i++) {
            if(itemsInNmtStore[i].getTitleNmt() == disc.getTitleNmt()) {
                for(int j=i; j<qtyOrdered; j++) {
                    itemsInNmtStore[j] = itemsInNmtStore[j+1];
                }
                i--;
                setQtyOrderedNmt(-1);
                System.out.println("The disc " + disc.getTitleNmt() + " has been removed in the Nmtung store");
            }
        }
    }
}
