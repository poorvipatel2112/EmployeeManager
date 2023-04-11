package tech.getarrays.employeemanager.repo;

import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Employee;

import java.io.Serializable;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);
//    Optional<Employee> findEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);

}
