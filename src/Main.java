public class Main {
    public static void main(String[] args) {
        Author author = new Author("Фёдор", "Достоевский");
        Book book = new Book(1862, "Записки из мертвого дома", author);
        Author author1 = new Author("Габриель", "Гарсия Маркес");
        Book book1 = new Book(1966, "Сто лет одиночества", author1);
        book1.setYear(1967);
        System.out.println(book.toString());
        System.out.println(book1.toString());
        if (book.equals(book1)) {
            throw new IllegalArgumentException("Такая книга уже есть.");
        }else {
            System.out.println("Можно сохранить книку ");
        }
    }
}
