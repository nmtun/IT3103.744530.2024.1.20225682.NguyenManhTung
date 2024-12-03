package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class BookTungNM extends MediaTungNM{
   
    private List<String> authors = new ArrayList<String>();

    // Default constructor
    public BookTungNM() {
        //super();
    }

    public BookTungNM(int id, String title, String category, float price) {
        super(id, title, category, price);
    }

    public boolean addAuthor(String name) {
        if(authors.contains(name)) {
            System.out.println("Already exits");
            return false;
        } else {
            authors.add(name);
            System.out.println("Author " + name + " has been added");
            return true;
        }
    }

    public boolean removeAuthor(String name) {
        if(!authors.contains(name)) {
            System.out.println("Author " + name + " does not exist");
            return false;
        } else {
            authors.remove(name);
            System.out.println("Author " + name + " has been removed");
            return true;
        }
    }
}
