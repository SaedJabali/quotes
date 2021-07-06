package reader;

public class Book {
    private final String[] tags;
    private final String author;
    private final String likes;
    private final String text;


    public Book(String[] tags, String author, String likes, String quote) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = quote;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
