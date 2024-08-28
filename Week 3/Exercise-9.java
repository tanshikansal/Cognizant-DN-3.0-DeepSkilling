public interface EmployeeView {
    String getName();
    String getDepartmentName();
}

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<EmployeeView> findAllBy();
}
public class DepartmentSummary {
    private String departmentName;
    private String location;

    public DepartmentSummary(String departmentName, String location) {
        this.departmentName = departmentName;
        this.location = location;
    }

}

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<DepartmentSummary> findAllBy();
}
