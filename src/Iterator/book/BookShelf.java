package Iterator.book;

import Iterator.Aggregate;
import Iterator.Iterator;

/**
 * @author ankh
 * @created at 2022-09-07 14:25
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int len;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int ind) {
        return this.books[ind];
    }

    public void appendBook(Book book) {
        this.books[len++] = book;
    }

    public int getLength() {
        return this.len;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
