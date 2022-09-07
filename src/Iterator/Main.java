package Iterator;

import Iterator.book.Book;
import Iterator.book.BookShelf;

/**
 * @author ankh
 * @created at 2022-09-07 14:39
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("凤凰架构"));
        bookShelf.appendBook(new Book("计算机组成原理"));
        bookShelf.appendBook(new Book("计算机网络"));
        bookShelf.appendBook(new Book("算法导论"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
