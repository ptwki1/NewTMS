package Lesson15.library;

public class Book {
    private String name, genre, year,cover;

    public Book(String name, String genre, String year, String cover) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getYear() {
        return year;
    }

    public String getCover() {
        return cover;
    }
}
