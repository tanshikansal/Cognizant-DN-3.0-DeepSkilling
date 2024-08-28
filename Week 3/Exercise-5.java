public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByEmailAddressAndLastname(String emailAddress, String lastname);
}

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.firstname LIKE %:substring%")
    List<User> findUsersBySubstring(@Param("substring") String substring);
}

@Entity
@NamedQuery(name = "User.findByName", query = "SELECT u FROM User u WHERE u.firstname = :name")
public class User {

}

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(@Param("name") String name);
}
