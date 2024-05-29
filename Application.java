package com.example.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

@RestController
class BookController {
    @GetMapping("/books")
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Effective Java", "Joshua Bloch", "https://example.com/effective_java.jpg"));
        books.add(new Book("Clean Code", "Robert C. Martin", "https://example.com/clean_code.jpg"));
        return books;
    }
}

class Book {
    private String title;
    private String author;
    private String image;

    public Book(String title, String author, String image) {
        this.title = title;
        this.author = author;
        this.image = image;
    }

    // Getters and setters...
}