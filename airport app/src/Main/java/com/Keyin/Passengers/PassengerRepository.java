package src.Main.java.com.Keyin.Passengers;


import com.Keyin.Passengers.Passengers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passengers, Long> {
}