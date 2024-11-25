package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class BookTungNM extends MediaTungNM{
   
    private List<String> authors = new ArrayList<String>();

    public BookTungNM() {
        // to do auto generated constructor stub
    }

    public void addAuthor(String name) {
        if(authors.contains(name)) {
            System.out.println("Author " + name + " already exist");
        } else {
            authors.add(name);
            System.out.println("Author " + name + " has been added successfully");
        }
    }

    public void removeAuthor(String name) {
        if(!authors.contains(name)) {
            System.out.println("Author " + name + " does not exist");
        } else {
            authors.remove(name);
            System.out.println("Author " + name + " has been removed");
        }
    }
}
