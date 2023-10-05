package lab4.lab4.model.Student_Course;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;
    @Getter
    @Setter
    private String courseName;
    @Getter
    @Setter
    private String description;
    @ManyToMany(mappedBy = "courses")
    @Getter
    @Setter
    private List<Student> students;
}
