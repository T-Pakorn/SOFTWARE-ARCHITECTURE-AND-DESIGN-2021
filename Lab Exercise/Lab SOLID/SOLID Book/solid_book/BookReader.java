package solid_book;

import java.util.List;

import solid_book.interfaces.PrintToScreenService;

public class BookReader implements PrintToScreenService {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        PrintToScreenService.printToScreen(book);
    }
}
