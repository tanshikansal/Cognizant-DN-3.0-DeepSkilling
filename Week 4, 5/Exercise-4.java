package com.example.bookstoreapi.model;

import lombok.Data;

@Data
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        // Logic to save the customer to your data source (e.g., database)
        // Return the saved Customer object with appropriate HTTP status (201 Created)
        // Handle validation, error scenarios, etc.
    }
}

@PostMapping("/register")
public ResponseEntity<String> registerCustomer(
        @RequestParam("firstName") String firstName,
        @RequestParam("lastName") String lastName,
        @RequestParam("email") String email) {
    // Logic to create a new customer using the form data
    // Return a success message or handle errors
}
