package solid_book.interfaces;

import solid_book.Book;

public interface PrintToScreenService {
    static void printToScreen(Book book) {
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}