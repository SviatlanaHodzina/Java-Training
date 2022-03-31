package by.epam.learn.entityBooks;

public class BookList {

    Book[] books;

    public BookList(Book[] books) {
        this.books = books;
    }

    public void showBookListByAuthor(String author) {
        for (Book a : books)
            if (a.author.equals(author)) {
                System.out.println("Book#" + a.getId() + " " + a.getBookTitle() + "\n\t " +
                        "  Author: " + a.getAuthor() + "\n\t " + "  Publisher: " + a.getPublisher() +
                        "\n\t" + "   Published:" + a.getYearOfPublishing() + "\n\t " + "  Pages: " +
                        a.getNumberOfPages() + "\n\t " + "  Price$: " + a.getPrice() + "\n\t " +
                        "  BindingTypes: " + a.getBindingTypes() + "\n\t ");
            }
    }

    public void showBookListByPublisher(String publisher) {
        for (Book a : books)
            if (a.publisher.equals(publisher)) {
                System.out.println("Book#" + a.getId() + " " + a.getBookTitle() + "\n\t "
                        + "  Author: " + a.getAuthor() + "\n\t " + "  Publisher: " + a.getPublisher()
                        + "\n\t" + "   Published:" + a.getYearOfPublishing() + "\n\t " + "  Pages: "
                        + a.getNumberOfPages() + "\n\t " + "  Price$: " + a.getPrice() + "\n\t "
                        + "  BindingTypes: " + a.getBindingTypes() + "\n\t ");
            }
    }

    public void showBookListByPublishingDate(int yearOfPublishing) {
        for (Book a : books)
            if (a.yearOfPublishing > yearOfPublishing) {
                System.out.println("Book#" + a.getId() + " " + a.getBookTitle() + "\n\t " +
                        "  Author: " + a.getAuthor() + "\n\t " + "  Publisher: " + a.getPublisher() +
                        "\n\t" + "   Published:" + a.getYearOfPublishing() + "\n\t " + "  Pages: " +
                        a.getNumberOfPages() + "\n\t " + "  Price$: " + a.getPrice() + "\n\t " +
                        "  BindingTypes: " + a.getBindingTypes() + "\n\t ");
            }
    }

    public void showBookListWithReplacedBook() {
        books[4].setId(6);
        books[4].setBookTitle("'Три товарища'");
        books[4].setAuthor("Эрих Мария Ремарк");
        books[4].setPublisher("Астрель");
        books[4].setYearOfPublishing(2011);
        books[4].setNumberOfPages(380);
        books[4].setPrice(3);
        books[4].setBindingTypes("Твердый переплет");
        System.out.println("Book#" + books[4].getId() + books[4].getBookTitle() + "\n\t " +
                "  Author: " + books[4].getAuthor() + "\n\t " + "  Publisher: "
                + books[4].getPublisher() + "\n\t" + "   Published:" + books[4].getYearOfPublishing()
                + "\n\t " + "  Pages: " + books[4].getNumberOfPages() + "\n\t " + "  Price$: "
                + books[4].getPrice() + "\n\t " + "  BindingTypes: " + books[4].getBindingTypes() + "\n\t ");
    }

    public void showBookList() {
        for (Book a : books)
            System.out.println("Book#" + a.getId() + " " + a.getBookTitle() + "\n\t " +
                    "  Author: " + a.getAuthor() + "\n\t " + "  Publisher: " + a.getPublisher() +
                    "\n\t" + "   Published:" + a.getYearOfPublishing() + "\n\t " + "  Pages: " +
                    a.getNumberOfPages() + "\n\t " + "  Price$: " + a.getPrice() + "\n\t " +
                    "  BindingTypes: " + a.getBindingTypes() + "\n\t ");
    }
}