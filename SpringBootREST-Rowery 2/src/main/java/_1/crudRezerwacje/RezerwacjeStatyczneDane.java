
package _1.crudRezerwacje;

import java.util.ArrayList;
import java.util.List;


public class RezerwacjeStatyczneDane {
    
    private List<Rezerwacja> rezerwacje;
    
    private static RezerwacjeStatyczneDane instance = null;
    static RezerwacjeStatyczneDane getInstance() {
        if(instance == null) {
            instance = new RezerwacjeStatyczneDane();
        }
        return instance;
    }
    
    public RezerwacjeStatyczneDane() {
        rezerwacje = new ArrayList<Rezerwacja>();
        rezerwacje.add(new Rezerwacja(1, "Adrian", "Włodarski", "592 145 902", "2022/05/25 16:50", "Górski"));
        rezerwacje.add(new Rezerwacja(2, "Bartek", "Ptasik", "564 132 245", "2022/05/25 6:50", "Górski"));
        rezerwacje.add(new Rezerwacja(3, "Mateusz", "Wójick", "752 164 242", "2022/05/25 18:50", "Szosowy"));
        rezerwacje.add(new Rezerwacja(4, "Edward", "Popiół", "545 145 765", "2022/05/25 12:00", "Miejski"));
        rezerwacje.add(new Rezerwacja(5, "Paweł", "Gęsikowski", "786 665 945", "2022/05/25 10:45", "Szosowy"));   
    }
    
    public List<Rezerwacja> pobierzRezerwacje() {
        return rezerwacje;
    }
    
    
    public Rezerwacja tworzenieRezerwacji(int id, String imie, String nazwisko, String numer,
            String data, String rodzaj) {
        Rezerwacja nowaRezerwacja = new Rezerwacja(id, imie, nazwisko, numer, data, rodzaj);
        rezerwacje.add(nowaRezerwacja);
        return nowaRezerwacja;
    }
    
    public Rezerwacja zmianaRezerwacji(int id, String imie, String nazwisko, String numer,
            String data, String rodzaj) {
        for(Rezerwacja rezerwacja: rezerwacje) {
            if(rezerwacja.getId() == id) {
                int indexRezerwacji = rezerwacje.indexOf(rezerwacja);
                rezerwacja.setImie(imie);
                rezerwacja.setNazwisko(nazwisko);
                rezerwacja.setNumer(numer);
                rezerwacja.setData(data);
                rezerwacja.setRodzaj(rodzaj);
                rezerwacje.set(indexRezerwacji, rezerwacja);
                return rezerwacja;
            }
        }
        return null;
    }
    
    public boolean usuwanieRezerwacji(int id) {
        int indexRezerwacji = -1;
        for(Rezerwacja rezerwacja: rezerwacje) {
            if(rezerwacja.getId() == id) {
                indexRezerwacji = rezerwacje.indexOf(rezerwacja);
                continue;
            }
        }
        if (indexRezerwacji > -1){
            rezerwacje.remove(indexRezerwacji);
            return true;
        }
        return false;
    }
    
}
