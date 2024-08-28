public interface AddressView {
    String getZipCode();
}

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<AddressView> findAllBy();
}

public class PersonSummary {
    private String firstName;
    private String lastName;

    public PersonSummary(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<PersonSummary> findAllBy();
}
