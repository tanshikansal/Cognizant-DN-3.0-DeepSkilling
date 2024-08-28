import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Set the HTTP status to 201 Created
    public Book createBook(@RequestBody Book book) {
        // Logic to save the book to your data source
        // Return the saved Book object
    }
}

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        // Logic to retrieve a book by its ID
        // Return a Book object or handle not found scenario

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Bookstore-Version", "1.0"); // Add a custom header

        return ResponseEntity.ok()
                .headers(headers)
                .body(book);
    }
}
