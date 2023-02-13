package testpackage;

import _1.dataclientcrud.*;

public class Rezerwacja {
    private int id;
    private String imie;
    private String nazwisko;
    private String numer_tel;
    private String data_rezerwacji;
    private String rodzaj_roweru;
    
    
    
    public Rezerwacja() { }
    
    public Rezerwacja(int id, String imie, String nazwisko , String numer_tel,
            String data_rezerwacji, String rodzaj_roweru) {
        this.setId(id);
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setNumerTel(numer_tel);
        this.setDataRezerwacji(data_rezerwacji);
        this.setRodzajRoweru(rodzaj_roweru);
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getImie() {
        return imie;
    }
    
    public void setImie(String imie) {
        this.imie = imie;
    }
    
    public String getNazwisko() {
        return nazwisko;
    }
    
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    
    public String getNumerTel() {
        return numer_tel;
    }
    
    public void setNumerTel(String numer_tel) {
        this.numer_tel = numer_tel;
    }
    
    public String getDataRezerwacji() {
        return data_rezerwacji;
    }
    
    public void setDataRezerwacji(String data_rezerwacji) {
        this.data_rezerwacji = data_rezerwacji;
    }
    
    public String getRodzajRoweru() {
        return rodzaj_roweru;
    }
    
    public void setRodzajRoweru(String rodzaj_roweru) {
        this.rodzaj_roweru = rodzaj_roweru;
    }
     
    @Override
    
    public String toString() {
        return "Rezerwacja {" +
                "id" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numer telefonu='" + numer_tel + '\'' +
                ", data rezerwacji='" + data_rezerwacji + '\'' +
                ", rodzaj roweru='" + rodzaj_roweru + '\'' +
                '}';
                
    }
}

