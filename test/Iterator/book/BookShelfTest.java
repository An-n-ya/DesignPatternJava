package Iterator.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
@author ankh
@created at 2022-09-07 14:45
*/class BookShelfTest {
    BookShelf bookShelf;
    Book[] books;

    @BeforeEach
    public void init() {
        bookShelf = new BookShelf(4);
        books = new Book[]{
                new Book("凤凰架构"),
                new Book("计算机组成原理"),
                new Book("计算机网络"),
                new Book("算法导论"),
        };
    }


    @Test
    public void iterator() {
        var it = bookShelf.iterator();
        var ind = 0;
        while (it.hasNext()) {
            var book = (Book) it.next();
            assertEquals(book, books[ind++]);
        }
        System.out.println("NICE!");
    }
}