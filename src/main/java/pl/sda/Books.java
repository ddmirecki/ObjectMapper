package pl.sda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-01-28.
 */
public class Books {
    String publishingHouse;
    String author;
    String title;
    String type;
    String id;
    public Books(){

    }

    List<Books> books = new ArrayList<>();

    public Books(String publishingHouse, String author, String title, String type, String id) {
        this.publishingHouse = publishingHouse;
        this.author = author;
        this.title = title;
        this.type = type;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Books{" +
                "publishingHouse='" + publishingHouse + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
