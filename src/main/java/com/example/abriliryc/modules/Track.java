package com.example.abriliryc.modules;


import jakarta.persistence.*;

@Entity
@Table(name = "tracks")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String lyric;

    @Column
    private int releaseYear;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int release_year) {
        this.releaseYear = release_year;
    }

    public Track() {
    }

    public Track(long id, String author, String name, String lyric, int releaseYear) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.lyric = lyric;
        this.releaseYear = releaseYear;
    }
}
