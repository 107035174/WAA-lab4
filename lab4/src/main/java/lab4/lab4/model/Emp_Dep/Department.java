package lab4.lab4.model.Emp_Dep;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;
    @Getter
    @Setter
    private String dName;
    @OneToMany(mappedBy = "department")
    @Getter
    @Setter
    private List<Employee> employees;
}
