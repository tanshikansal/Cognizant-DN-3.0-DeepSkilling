package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

}

@GetMapping
public List<Book> getAllBooks() {
    // Logic to retrieve all books from your data source (e.g., database)
    // Return a list of Book objects
}

#### GET Book by ID

```java
@GetMapping("/{id}")
public Book getBookById(@PathVariable Long id) {
    // Logic to retrieve a book by its ID
    // Return a Book object or handle not found scenario
}

@PostMapping
public Book createBook(@RequestBody Book book) {
    // Logic to save a new book to your data source
    // Return the saved Book object
}

@PutMapping("/{id}")
public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
    // Logic to update an existing book by its ID
    // Return the updated Book object or handle not found scenario
}

@DeleteMapping("/{id}")
public void deleteBook(@PathVariable Long id) {
    // Logic to delete a book by its ID
    // No return value (void)
}

