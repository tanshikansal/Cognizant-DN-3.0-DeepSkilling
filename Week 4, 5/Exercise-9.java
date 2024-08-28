import org.springframework.hateoas.RepresentationModel;

public class Customer extends RepresentationModel<Customer> {
    private String customerId;
    private String customerName;
    private String companyName;

}

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/{customerId}")
    public Customer getCustomerById(@PathVariable String customerId) {

        Link selfLink = WebMvcLinkBuilder.linkTo(CustomerController.class)
                .slash(customerId)
                .withSelfRel();


        Customer customer = new Customer();
        customer.setCustomerId(customerId);
        customer.setCustomerName("Jane");
        customer.setCompanyName("ABC Company");
        customer.add(selfLink); // Add self link to the response

        return customer;
    }
}
