package by.epam.learn.entityBooks;

import com.sun.source.tree.UsesTree;

import java.util.Arrays;

public class BookListMain {

    public static void main(String[] args) {

        Book[] books = new Book[5];

        for (int i = 0; i < books.length; i++)
            books[i] = new Book();

        books[0].id = 1;
        books[0].bookTitle = "'A Short History of nearly Everything'";
        books[0].author = "Bill Bryson";
        books[0].publisher = "Black Swan";
        books[0].yearOfPublishing = 2004;
        books[0].numberOfPages = 688;
        books[0].price = 11.99;
        books[0].bindingTypes = "Paperback";

        books[1].id = 2;
        books[1].bookTitle = "'Japan Profile of A Nation'";
        books[1].author = "Steve Gardner";
        books[1].publisher = "'Kodansha International'";
        books[1].yearOfPublishing = 1994;
        books[1].numberOfPages = 360;
        books[1].price = 5.99;
        books[1].bindingTypes = "Paperback";

        books[2].id = 3;
        books[2].bookTitle = "'The Importance of Being Earnest'";
        books[2].author = "Oscar Wilde";
        books[2].publisher = "'Macmillan Collector's'";
        books[2].yearOfPublishing = 2017;
        books[2].numberOfPages = 472;
        books[2].price = 7.54;
        books[2].bindingTypes = "Hardcover";

        books[3].id = 4;
        books[3].bookTitle = "'Love of Life'";
        books[3].author = "Jack London";
        books[3].publisher = "'CreateSpace Independent Publishing Platform'";
        books[3].yearOfPublishing = 2016;
        books[3].numberOfPages = 114;
        books[3].price = 5.5;
        books[3].bindingTypes = "Paperback";

        books[4].id = 5;
        books[4].bookTitle = "'Islands In The Stream'";
        books[4].author = "Ernest Hemingway";
        books[4].publisher = "'Scribner'";
        books[4].yearOfPublishing = 1997;
        books[4].numberOfPages = 448;
        books[4].price = 17.98;
        books[4].bindingTypes = "Paperback";

        String specifiedAuthor = "Bill Bryson";
        String specifiedPublisher = "'Macmillan Collector's'";
        int specifiedYearOfPublishing = 1997;
        int indexOfTheReplacedBook = 4;

        BookList list = new BookList(books);

        System.out.println("Book List:" + "\n\t ");
        list.showBookList();

        System.out.println("Список книг заданного автора: " + specifiedAuthor + "\n\t ");
        list.showBookListByAuthor(specifiedAuthor);

        System.out.println("Список книг, выпущенных заданным издательством: " + specifiedPublisher + "\n\t ");
        list.showBookListByPublisher(specifiedPublisher);

        System.out.println("Список книг, выпущенных после заданного года: " + specifiedYearOfPublishing + "\n\t ");
        list.showBookListByPublishingDate(specifiedYearOfPublishing);

        System.out.println("Список замененных книг:");
        System.out.println("Book#" + books[indexOfTheReplacedBook].getId() + " is exchanged by:" + "\n\t");
        list.showBookListWithReplacedBook();
    }
}