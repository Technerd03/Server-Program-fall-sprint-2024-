package src.Main.java.com.Keyin.Airports;

import com.Keyin.Airports.Airports;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airports, Long> {
}