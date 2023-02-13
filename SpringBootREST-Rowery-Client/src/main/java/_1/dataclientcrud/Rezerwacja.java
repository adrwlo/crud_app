package _1.dataclientcrud;

public class Rezerwacja {
    private int id;
    private String imie;
    private String nazwisko;
    private String numer;
    private String data;
    private String rodzaj;
    
    public Rezerwacja() { }
    
    public Rezerwacja(int id, String imie, String nazwisko , String numer,
            String data, String rodzaj) {
        this.setId(id);
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setNumer(numer);
        this.setData(data);
        this.setRodzaj(rodzaj);
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
    
    public String getNumer() {
        return numer;
    }
    
    public void setNumer(String numer) {
        this.numer = numer;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public String getRodzaj() {
        return rodzaj;
    }
    
    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }
     
    @Override
    
    public String toString() {
        return "Rezerwacja {" +
                "id" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numer telefonu='" + numer + '\'' +
                ", data rezerwacji='" + data + '\'' +
                ", rodzaj roweru='" + rodzaj + '\'' +
                '}';
                
    }
}

