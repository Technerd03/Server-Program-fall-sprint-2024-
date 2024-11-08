package src.Main.java.com.Keyin.AirCraft;

import com.Keyin.Airports.Airports;
import com.Keyin.Passengers.Passengers;
import javax.persistence.*;

import java.util.List;

@Entity
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String airlineName;
    private int numberOfPassengers;

    @ManyToMany
    @JoinTable(
        name = "passenger_aircraft",
        joinColumns = @JoinColumn(name = "aircraft_id"),
        inverseJoinColumns = @JoinColumn(name = "passenger_id")
    )
    private List<Passengers> passengers;

    @ManyToMany
    @JoinTable(
        name = "aircraft_airport",
        joinColumns = @JoinColumn(name = "aircraft_id"),
        inverseJoinColumns = @JoinColumn(name = "airport_id")
    )
    private List<Airports> airports;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getAirlineName() { return airlineName; }
    public void setAirlineName(String airlineName) { this.airlineName = airlineName; }

    public int getNumberOfPassengers() { return numberOfPassengers; }
    public void setNumberOfPassengers(int numberOfPassengers) { this.numberOfPassengers = numberOfPassengers; }

    public List<Passengers> getPassengers() { return passengers; }
    public void setPassengers(List<Passengers> passengers) { this.passengers = passengers; }

    public List<Airports> getAirports() { return airports; }
    public void setAirports(List<Airports> airports) { this.airports = airports; }
}