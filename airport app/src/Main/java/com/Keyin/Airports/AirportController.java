package src.Main.java.com.Keyin.Airports;

import Main.Airports.Airports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Airports/Airports")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping
    public List<Airports> getAllAirports() {
        return airportService.findAll();
    }

    @PostMapping
    public Airports addAirport(@RequestBody Airports airport) {
        return airportService.save(airport);
    }

    @GetMapping("/{id}")
    public Airports getAirportById(@PathVariable Long id) {
        return airportService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAirport(@PathVariable Long id) {
        airportService.delete(id);
    }
}
