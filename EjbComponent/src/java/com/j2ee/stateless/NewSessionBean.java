package com.j2ee.stateless;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class NewSessionBean implements NewSessionBeanRemote {
    
    List<String> bookShelf;
    
    public NewSessionBean(){
        bookShelf = new ArrayList<String>();
        
    }
    public void addBook(String bookName){
        bookShelf.add(bookName);
    }
    public List<String> getBooks(){
        return bookShelf;
    }
   
}
