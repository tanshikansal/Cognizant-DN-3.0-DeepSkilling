public interface CustomerRepository {
    Customer findCustomerById(int customerId);
}

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customerData = new HashMap<>();

    @Override
    public Customer findCustomerById(int customerId) {
        return customerData.get(customerId);
    }

}

public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerById(int customerId) {
        return customerRepository.findCustomerById(customerId);
    }
}

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        CustomerService customerService = new CustomerService(customerRepository);

        int customerId = 123;
        Customer customer = customerService.getCustomerById(customerId);

        if (customer != null) {
            System.out.println("Customer details:");
            System.out.println("ID: " + customer.getId());
            System.out.println("Name: " + customer.getName());
        } else {
            System.out.println("Customer not found.");
        }
    }
}