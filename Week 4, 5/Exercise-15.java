@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/{id}")
    @Operation(summary = "Get a book by ID")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        // Logic to retrieve book details by ID
        // Return the book
    }

}
