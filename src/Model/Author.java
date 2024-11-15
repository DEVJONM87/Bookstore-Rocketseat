package Model;

import java.util.Objects;

public class Author {
    private int authorId;
    private String fullName;
    private String birthday;

    // CONSTRUCTOR #0
    public Author(int authorId, String fullName, String birthday) {
        this.authorId = authorId;
        this.fullName = fullName;
        this.birthday = birthday;
    }
    // CONSTRUCTOR #1
    public Author(String fullName, String birthday) {
        this.fullName = fullName;
        this.birthday = birthday;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorId == author.authorId && Objects.equals(fullName, author.fullName) && Objects.equals(birthday, author.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId, fullName, birthday);
    }
}
