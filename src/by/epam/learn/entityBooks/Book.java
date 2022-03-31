package by.epam.learn.entityBooks;

public class Book {
    int id;
    String bookTitle;
    String author;
    String publisher;
    int yearOfPublishing;
    int numberOfPages;
    double price;
    String bindingTypes;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && yearOfPublishing == book.yearOfPublishing && numberOfPages == book.numberOfPages &&
                Double.compare(book.price, price) == 0 && bookTitle.equals(book.bookTitle) && author.equals(book.author) &&
                publisher.equals(book.publisher) && bindingTypes.equals(book.bindingTypes);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingTypes() {
        return bindingTypes;
    }

    public void setBindingTypes(String bindingTypes) {
        this.bindingTypes = bindingTypes;
    }
}