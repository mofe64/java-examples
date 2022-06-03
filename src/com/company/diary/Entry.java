package com.company.diary;

import java.time.LocalDate;
import java.util.UUID;

public class Entry {

    private final String id;
    private String title;
    private String body;
    private final LocalDate dateCreated = LocalDate.now();

    public Entry(String title, String body) {
        this(UUID.randomUUID().toString(), title, body);

    }

    public Entry(String id, String title, String body) {
        if (title.length() == 0) {
            throw new IllegalArgumentException("title cannot be empty");
        }
        if (body.isEmpty()) {
            throw new IllegalArgumentException("body cannot be empty");
        }
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public String getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return ("Body: " + getBody() +
                "\nTitle: " + getTitle() +
                "\nID: " + getId() +
                "\nDate: " + getDateCreated());

    }
}
