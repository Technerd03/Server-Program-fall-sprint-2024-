package src.Main.java.com.Keyin.Airports;


import com.Keyin.Airports.Airports;

import com.Keyin.Airports.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {

    @Autowired
    private Main.Airports.AirportRepository airportRepository;

    public List<Airports> findAll() {
        return airportRepository.findAll();
    }

    public Airports save(Airports airport) {
        return airportRepository.save(airport);
    }

    public Airports findById(Long id) {
        return airportRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        Main.Airports.AirportRepository.deleteById(id);
    }
}