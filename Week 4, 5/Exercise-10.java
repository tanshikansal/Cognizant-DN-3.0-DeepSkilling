@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping(value = "/{id}", produces = { "application/json", "application/xml" })
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = ...; 
        return ResponseEntity.ok(book);
    }

}