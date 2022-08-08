import java.util.Objects;
public class Book {
    private Author author;
    private int year;
    private final String title;

    public Book(int year, String title, Author author) {
        this.year = year;
        this.title = title;
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Автор: " + this.author + ", Название: " + this.title + ", Год издания: " + this.year;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author) && year == book.year;
    }

    public int hashCode() {
        return Objects.hash(title, author, year);
    }
}
