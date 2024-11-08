package src.Main.java.com.Keyin.Airports;

import javax.persistence.*;

import com.Keyin.Cities.Cities;

@Entity
public class Airports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private Cities city;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    
    public Cities getCity() { return city; }
    public void setCity(Cities city) { this.city = city; }
}