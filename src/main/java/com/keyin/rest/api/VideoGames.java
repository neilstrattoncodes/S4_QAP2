package com.keyin.rest.api;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Entity;


@Entity
public class VideoGames {
    @Id
    @SequenceGenerator(name = "videogames_sequence", sequenceName = "videogames_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "videogames_sequence")
    private long id;
    private String title;
    private String console;

    private double price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
