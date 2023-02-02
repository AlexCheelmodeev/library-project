package java.library.models;

public class Book {
    private int id;
    private String name;
    private String author;
    private int dateOfCreation;

    public Book(int id, String name, String author, int dateOfCreation) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.dateOfCreation = dateOfCreation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(int dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
}
