package Model;

import java.util.Date;

public class Book {
    private int bookId;
    private int isbnCode;
    private String title;
    private String overview;
    private int publicationYear;
    private int pages;
    private String publisherName;
    private Date createdAt;
    private Date updatedAt;
    private Author author;
    private boolean available;

    // CONSTRUCTOR #0
    public Book(int bookId, int isbnCode, String title, String overview,
                int publicationYear, int pages, String publisherName, Date createdAt,
                Date updatedAt, Author author) {
        this.bookId = bookId;
        this.isbnCode = isbnCode;
        this.title = title;
        this.overview = overview;
        this.publicationYear = publicationYear;
        this.pages = pages;
        this.publisherName = publisherName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.author = author;
    }

    // CONSTRUCTOR #1
    public Book(String title, Author author,
                boolean available, Date createdAt, Date updatedAt) {
        this.title = title;
        this.author = author;
        this.available = available;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(int isbnCode) {
        this.isbnCode = isbnCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
