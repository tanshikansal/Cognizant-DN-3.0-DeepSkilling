@GetMapping("/{id}")
public Book getBookById(@PathVariable Long id) {
    // Logic to retrieve a book by its ID
    // Return a Book object or handle not found scenario
}

@GetMapping("/search")
public List<Book> searchBooks(@RequestParam(required = false) String title,
                              @RequestParam(required = false) String author) {
    // Logic to filter books based on title and/or author
    // Return a list of matching Book objects
}
