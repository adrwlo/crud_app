package _1.crudRezerwacje;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
public class Kontroler {
    
    RezerwacjeStatyczneDane rezerwacjeStatyczneDane = RezerwacjeStatyczneDane.getInstance();
    
    @GetMapping("/rezerwacje")
    public List<Rezerwacja> rezerwacje() {
        return rezerwacjeStatyczneDane.pobierzRezerwacje();
    }
      
    @PostMapping("/rezerwacja/dodaj")
    public Rezerwacja utworzRezerwacje (@RequestBody Map<String, String> body) {
        int id = Integer.parseInt(body.get("id"));
        String imie = body.get("imie");
        String nazwisko = body.get("nazwisko");
        String numer = body.get("numer");
        String data = body.get("data");
        String rodzaj = body.get("rodzaj");

        return rezerwacjeStatyczneDane.tworzenieRezerwacji(id, imie, nazwisko, 
                numer, data, rodzaj);
    }
    
    @PutMapping("/rezerwacja/zmien/{id}") 
    public Rezerwacja zmienRezerwacje(@PathVariable String id, @RequestBody Map<String, String> body) {
        int rezerwacjaId = Integer.parseInt(id);
        String imie = body.get("imie");
        String nazwisko = body.get("nazwisko");
        String numer = body.get("numer");
        String data = body.get("data");
        String rodzaj = body.get("rodzaj");
        return rezerwacjeStatyczneDane.zmianaRezerwacji(rezerwacjaId, imie, nazwisko, 
                numer, data, rodzaj);
    }
    
    @DeleteMapping("/rezerwacja/usun/{id}") 
    public boolean usunRezerwacje(@PathVariable String id) {
        int rezerwacjaId = Integer.parseInt(id);
        return rezerwacjeStatyczneDane.usuwanieRezerwacji(rezerwacjaId);
    }
       
}
