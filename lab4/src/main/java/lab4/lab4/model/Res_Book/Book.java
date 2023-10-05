package lab4.lab4.model.Res_Book;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String isbn;
    @OneToMany
    @JoinColumn(name = "reservation_id")
    @Getter
    private List<Reservation> reservations;
}
