
package com.j2ee.stateless;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface NewSessionBeanRemote {
    
    void addBook(String bookName);
    
    List getBooks();
    
}
