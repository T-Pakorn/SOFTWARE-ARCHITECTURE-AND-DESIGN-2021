package solid_book;

import java.util.List;

import solid_book.interfaces.PrintToFileService;

public class BookPublisher implements PrintToFileService {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        PrintToFileService.printToFile(book);
    }
}
